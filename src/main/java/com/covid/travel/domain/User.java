package com.covid.travel.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Table
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	int  _cn6ca;
	String accuracylocation;
	String address;
	String datasource;
	String  latlong;
	String modeoftravel;
	String pid;
	String placename;
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss", iso = ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	LocalDateTime timefrom;
	 
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss", iso = ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    LocalDateTime timeto;
	String type;
	
	
	
	@JsonIgnore
	public LocalDateTime getTimefrom() {
		return timefrom;
	}
	public void setTimefrom(String timefrom) {
		
		this.timefrom = DateUtil.parseDateFormat(timefrom);
		
	}
	@JsonIgnore
	public LocalDateTime getTimeto() {
		return timeto;
	}
	public void setTimeto(String timeto) {
		this.timeto = DateUtil.parseDateFormat(timeto);
	}
	public int get_cn6ca() {
		return _cn6ca;
	}
	public void set_cn6ca(int _cn6ca) {
		this._cn6ca = _cn6ca;
	}
	public String getAccuracylocation() {
		return accuracylocation;
	}
	public void setAccuracylocation(String accuracylocation) {
		this.accuracylocation = accuracylocation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDatasource() {
		return datasource;
	}
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	public String getLatlong() {
		return latlong;
	}
	public void setLatlong(String latlong) {
		this.latlong = latlong;
	}
	public String getModeoftravel() {
		return modeoftravel;
	}
	public void setModeoftravel(String modeoftravel) {
		this.modeoftravel = modeoftravel;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPlacename() {
		return placename;
	}
	public void setPlacename(String placename) {
		this.placename = placename;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [_cn6ca=" + _cn6ca + ", accuracylocation=" + accuracylocation + ", address=" + address
				+ ", datasource=" + datasource + ", latlong=" + latlong + ", modeoftravel=" + modeoftravel + ", pid="
				+ pid + ", placename=" + placename + ", timefrom=" + timefrom + ", timeto=" + timeto + ", type=" + type
				+ "]";
	}
	
	
	
		
	
	
	

}
