package com.example.demo2.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    
	@GetMapping("/")
	//@ResponseBody 
	public String home(HttpServletRequest request, ModelMap modelMap)
	{ 
		String name= request.getParameter("name")!=null && !request.getParameter("name").isEmpty()
				?request.getParameter("name"): "Yello World!";
		modelMap.put("variableVue", name);
		System.out.println("\n\n\n\n"+name+"\n\n\n\n");
		return "pages/home";
	}
	

	
}
