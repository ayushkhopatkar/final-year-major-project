package com.house.rental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class homecontroller {
	//default page 
	@GetMapping("/")
	public String home(Model m) {
		m.addAttribute("title", "Home-House Rentals");
		return "base";
	}
	
	// for about page 
	@GetMapping("about")
	public String about(Model m) {
		m.addAttribute("title", "about-House Rentals");
		return "about";
	}
	
	// for profile page 
	@GetMapping("profile")
	public String profile(Model m) {
		m.addAttribute("profile", "profile-House Rentals");
		return "profile";
	}
	
	// for chatting between users
	@GetMapping("chat")
	public String chat(Model m) {
		m.addAttribute("chat", "chat-House Rentals");
		return "chat";
	}
	
	// handler for uploading the property
	@PostMapping("property-upload")
	public String postMethodName(@RequestBody String entity) {
		// idhar form ka hisab sa karo changes dhruv bhay
		return "profile";
	}
	
	// sign up page 
	@GetMapping("/signup")
	public String signup(Model m) {
       // user entity aayega yaha hona ka bad add krna ha	    
		return "signup";
	}
	
	// login page 
	@GetMapping("/signin")
	public String customLogin(Model model) {
		model.addAttribute("title","Login page");
		return "login";
	}
	
	@GetMapping("/searchfilter")
	public String getMethodName() {
		return "searchfilter";
	}
	

}
