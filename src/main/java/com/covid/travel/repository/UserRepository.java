package com.covid.travel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.covid.travel.domain.User;
@Repository
public interface UserRepository  extends CrudRepository<User,Long>{

	Iterable<User> save(List<User> users);

}
