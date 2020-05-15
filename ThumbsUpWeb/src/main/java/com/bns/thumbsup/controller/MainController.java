package com.bns.thumbsup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bns.thumbsup.service.UserService;

//메인 컨트롤러, RestController 어노테이션 ?

@Controller
public class MainController {

	@Autowired
	private UserService userService;
	
	@Controller
	@RequestMapping("/index")
	public class HelloController {
		@RequestMapping(method=RequestMethod.GET) public String index() {
			return "index";
		}
	}
	

	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name,
			@RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
		
		com.bns.thumbsup.vo.User n = new com.bns.thumbsup.vo.User();
		n.setName(name);
		n.setEmail(email);
		userService.userInsert(n);
		
		return "Saved";
		
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<com.bns.thumbsup.vo.User> getAllUser(){
		return userService.userSelect();
	}

}
