package com.brainmentors.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class MyController {
	@RequestMapping("/hello")
	public String sayWelcome(Model model) {
		model.addAttribute("msg", "Hello User");
		UserDTO user = new UserDTO();
		user.setUid("sample user");
		
		model.addAttribute("usermodel", user);
		return "welcome";
	}
	@RequestMapping(method = RequestMethod.POST,path = "/login")
	public String doLogin(@RequestParam("uid") String userid, @RequestParam("pwd") String password, Model model) {
		if(userid.equals(password)) {
			model.addAttribute("userid", userid);
			
			return "dashboard";
		}
		else {
			return "index";
		}
	}
	@RequestMapping(method = RequestMethod.POST,path = "/login2")
	public String doLogin2(@ModelAttribute("usermodel") UserDTO userDTO, Model model) {
		if(userDTO.getUid().equals(userDTO.getPwd())) {
			model.addAttribute("userid", userDTO.getUid());
			return "dashboard";
		}
		else {
			return "index";
		}
	}
	@ModelAttribute("user")
	public UserSessionAttr createSessionAttr() {
			return new UserSessionAttr();
	}
	
	@RequestMapping(method = RequestMethod.POST,path = "/login4")
	public ModelAndView doLogin4(HttpServletRequest request, @SessionAttribute("user") UserSessionAttr userObj) {
		ModelAndView mv = new ModelAndView();
		if(request.getParameter("uid").equals(request.getParameter("pwd"))) {
			userObj.setUserid(request.getParameter("uid"));
			//session.setAttribute("userid", request.getParameter("uid"));
			mv.addObject("userid",request.getParameter("uid"));
			mv.setViewName("dashboard");
			
			//return "dashboard";
		}
		else {
			mv.setViewName("index");
			//return "index";
		}
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST,path = "/login3")
	public ModelAndView doLogin3(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		if(request.getParameter("uid").equals(request.getParameter("pwd"))) {
			session.setAttribute("userid", request.getParameter("uid"));
			mv.addObject("userid",request.getParameter("uid"));
			mv.setViewName("dashboard");
			
			//return "dashboard";
		}
		else {
			mv.setViewName("index");
			//return "index";
		}
		return mv;
	}
}
