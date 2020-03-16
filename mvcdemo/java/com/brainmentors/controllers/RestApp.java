package com.brainmentors.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApp {
	@RequestMapping(path = "/hellouser",method =GET )
	
public String sayHello() {
	//return "Hello User";
		return "{id:1001,name:'Ram'}";
}
	@RequestMapping(path = "/hellouser/{name}/{id}",method =GET )
	public String sayHello2(@PathVariable("name") String n,@PathVariable("id") int id) {
		//return "Hello User";
			return "{id:"+id+",name:'"+n+"'}";
	}
	
	@RequestMapping(path = "/hellouser2",method =GET )
	public String sayHello3(@RequestParam("name") String n,@RequestParam("id") int id) {
		//return "Hello User";
			return "{id:"+id+",name:'"+n+"'}";
	}
	@CrossOrigin
	@RequestMapping(path = "/hellouser3", method =RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody UserInfo sayHello4(@RequestBody UserDetails userObject) {
		//return "Hello User";
		System.out.println("User Object :::: "+userObject);
		UserInfo userInfo = new UserInfo();
		userInfo.setName(userObject.getUserid());
		userInfo.setCity("Delhi");
		userInfo.setPhone(userObject.getPhone());
		return userInfo ;
			
	}
	
	@RequestMapping(path = "/hellouser4/{name}/{phone}", method =RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			 )
	public @ResponseBody UserInfo sayHello5(@PathVariable("name") String name, @PathVariable("phone")String phone) {
		//return "Hello User";
		
		UserInfo userInfo = new UserInfo();
		userInfo.setName(name);
		userInfo.setCity("Delhi");
		userInfo.setPhone(phone);
		return userInfo ;
			
	}
}
