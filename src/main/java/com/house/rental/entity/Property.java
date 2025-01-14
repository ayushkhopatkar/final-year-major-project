package com.house.rental.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "PROPERTY")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int property_id;
	
	@NotBlank(message ="Please select the property type !!")
	private String property_type;
	
//	location ka alag entity banane ka dekhte hai abhi bas dalke rakhte hai location 
	private Location location;
	
	private int age_of_property;
	private Date available_from;
//	type of user whom willing to rent ? bachelor family etc..
	private String willing_to_rent;
//	okay with broker contacting ?
	private boolean broker_contancting;
//	Describe property 
	private String description;
//	images ka bhi object hi dekhte hai aapn banane ka 
	private Images img;
	private Amities amitites;
//	property profile ka entity dekhte hai warna issi me kar denge issue huwa to 
	private Profile profile;
	private int rent_amount;
	@ManyToOne
	@JsonIgnore
	private User user;
	public int getProperty_id() {
		return property_id;
	}
	public void setProperty_id(int property_id) {
		this.property_id = property_id;
	}
	public String getProperty_type() {
		return property_type;
	}
	public void setProperty_type(String property_type) {
		this.property_type = property_type;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getAge_of_property() {
		return age_of_property;
	}
	public void setAge_of_property(int age_of_property) {
		this.age_of_property = age_of_property;
	}
	public Date getAvailable_from() {
		return available_from;
	}
	public void setAvailable_from(Date available_from) {
		this.available_from = available_from;
	}
	public String getWilling_to_rent() {
		return willing_to_rent;
	}
	public void setWilling_to_rent(String willing_to_rent) {
		this.willing_to_rent = willing_to_rent;
	}
	public boolean isBroker_contancting() {
		return broker_contancting;
	}
	public void setBroker_contancting(boolean broker_contancting) {
		this.broker_contancting = broker_contancting;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Images getImg() {
		return img;
	}
	public void setImg(Images img) {
		this.img = img;
	}
	public Amities getAmitites() {
		return amitites;
	}
	public void setAmitites(Amities amitites) {
		this.amitites = amitites;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public int getRent_amount() {
		return rent_amount;
	}
	public void setRent_amount(int rent_amount) {
		this.rent_amount = rent_amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}

//property:
//	  user_id
//	  property_id
//	  basic details:
//	  property type: string flat , villa ye sab 
//	  location obj
//	  prop profile
//	  age_of_property:int 
//	  available from: date
//	  willing to rent: int 3 types 
//	  rent_amount:
//	  okay_with_broker_contancting:boolean 
//	  describe prop: string 
//	  image_video
//	  aminities: list<string>
//
//	images_video:
//	user_id:
//	content_type: image/video
//	full_video_name:
//	List<string> image_name:
//
//	location detail :
//	   city 
//	   locality 
//	   apartment/society 
//	   house number
//
//	property profile
//	   // room details
//	   no. of bedrooms :int
//	   no. of bathrooms :int
//	   area details in sq-feet: int
//	   type_of_furnish :
//	   // floor details 
//	   total floors.
//	   floor of your property.
//	   furnish_detial:entity/list<string>/object Boolean
//
//	furnish entity:
