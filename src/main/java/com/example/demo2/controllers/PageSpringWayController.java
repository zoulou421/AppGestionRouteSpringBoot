package com.example.demo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageSpringWayController {

	@GetMapping("/accueil")
	public String accueil(@RequestParam(required=false, defaultValue="World") String name, ModelMap modelMap) {
		modelMap.put("variableVue", name);
		return "pages/home";
	}
}
