package com.covid.travel;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.covid.travel.domain.User;
import com.covid.travel.service.UserService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

@SpringBootApplication
@EntityScan(basePackages = "com.covid.travel")
@ComponentScan("com.covid.*")
public class TravelApplication {
	@Autowired
	ObjectMapper mapper ;
	public static void main(String[] args) {
		SpringApplication.run(TravelApplication.class, args);
	}

	@PostConstruct
	  public void setUp() {
	    mapper.registerModule(new JavaTimeModule());
	  }
	@Bean
	CommandLineRunner runner(UserService userService)
	{ return args -> {
	    
	    TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
	    InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
	    try{
	     List<User> users = mapper.readValue(inputStream,typeReference);
	     userService.save(users);
	     System.out.println("-----------Users Saved!");
	     
	      }catch(IOException e){
	        System.out.println("Unable to save users: "+ e.getMessage());
	      }
	};
	   
	}
	
}
