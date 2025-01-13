package com.house.rental.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "USER")
public class User {
	private int u_id;
	private String u_type;
	
	@NotBlank(message = "please fill first name!!")
	private String u_first_name;
	
	@NotBlank(message = "please fill last name!!")
	private String u_last_name;
	
	@Column(unique = true)
	@Email(message="Invalid email format")
	private String u_email;
	
	@Column(unique = true)
	private int u_phone_number;
	
	@NotBlank(message = "please enter you city !!")
	private String u_city;
	
	// optionals 
	
	//for dealers only
    //name of company for which dealer works
	private String c_name;
	// license of same 
	private String c_license;
	
	private String u_address;
	
	private int u_landline;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
	private List<Property> property =new ArrayList<>();
	
	public List<Property> getProperty() {
		return property;
	}
	public void setProperty(List<Property> property) {
		this.property = property;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_type() {
		return u_type;
	}
	public void setU_type(String u_type) {
		this.u_type = u_type;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_license() {
		return c_license;
	}
	public void setC_license(String c_license) {
		this.c_license = c_license;
	}
	public String getU_first_name() {
		return u_first_name;
	}
	public void setU_first_name(String u_first_name) {
		this.u_first_name = u_first_name;
	}
	public String getU_last_name() {
		return u_last_name;
	}
	public void setU_last_name(String u_last_name) {
		this.u_last_name = u_last_name;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public int getU_phone_number() {
		return u_phone_number;
	}
	public void setU_phone_number(int u_phone_number) {
		this.u_phone_number = u_phone_number;
	}
	public String getU_city() {
		return u_city;
	}
	public void setU_city(String u_city) {
		this.u_city = u_city;
	}
	public String getU_address() {
		return u_address;
	}
	public void setU_address(String u_address) {
		this.u_address = u_address;
	}
	public int getU_landline() {
		return u_landline;
	}
	public void setU_landline(int u_landline) {
		this.u_landline = u_landline;
	}
}
