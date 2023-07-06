package com.alpaca.eg.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	// @Controller + @ResponseBody -> everything within this class has Controller & ResponseBody
@RequestMapping("/lifecycle/eg01")
public class Eg01RestController {
	
	@RequestMapping("/3")
	public Person objectResponse() 
	{
		Person person = new Person("Harry", 21);
		return person;
	}
	// return type eventually becomes string -> this string is put into the body of the response
	
	//response with status code
	// 200 OK -> success
	// 404 400 500 etc -> all errors
	@RequestMapping("/4")
	public ResponseEntity<Person> entityResponse()
	{
		Person person = new Person("Harry", 21);
		// use when i want to set status code
		ResponseEntity<Person> entity = new ResponseEntity<Person>(person, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
}
