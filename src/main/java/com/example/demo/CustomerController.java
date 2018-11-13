package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@MyAnnotation(name="Test")
	@RequestMapping(path="/name",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)	
	public String getName() {
		return "My Name is Aditya";
	}
	
	@RequestMapping(path="/name",consumes=MediaType.TEXT_PLAIN_VALUE,produces=MediaType.TEXT_PLAIN_VALUE, method=RequestMethod.POST)	
	public String postName(@RequestBody String myName) {
		return "MyName is ="+myName;
	}
	
}
