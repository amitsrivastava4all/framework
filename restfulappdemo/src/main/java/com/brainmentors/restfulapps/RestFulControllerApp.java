package com.brainmentors.restfulapps;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.brainmentors.controllers.UserDetails;
//import com.brainmentors.controllers.UserInfo;

@CrossOrigin(origins = {"192.168.1.2","202.199.10.2"},maxAge = 1000*60*10,methods = {RequestMethod.GET, RequestMethod.POST},
allowedHeaders = {"Authorization:Basic"} )
@RestController
public class RestFulControllerApp {
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello User I am RestFul WebService ";
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
//	@CrossOrigin
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
		userInfo.setId(101);
		userInfo.setUrl("https://www.google.com");
		return userInfo ;
			
	}
	
	@RequestMapping(path="/hello5",method = RequestMethod.POST)
	public String sayHello5(@RequestBody UserDetails userObject){
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8080/restfulappdemo/hellouser2?name=Ram&id=1001";
		String result = rt.getForObject(url, String.class);
		return result;
		
	}
	
//	
//	@RequestMapping(path = "/hellouser4/{name}/{phone}", method =RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE
//			 )
//	public @ResponseBody UserInfo sayHello5(@PathVariable("name") String name, @PathVariable("phone")String phone) {
//		//return "Hello User";
//		
//		UserInfo userInfo = new UserInfo();
//		userInfo.setName(name);
//		userInfo.setCity("Delhi");
//		userInfo.setPhone(phone);
//		return userInfo ;
//			
//	}

}
