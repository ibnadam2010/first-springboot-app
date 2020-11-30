package com.springboot.springbootfirstapp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pagesController {
	
	@GetMapping("/")
	public String home(HttpServletRequest request, ModelMap modMap) {
		//System.out.println(request.getParameter("name"));
		modMap.addAttribute("test", "me voici");
		request.setAttribute("autre", "encore une fois");
		String name =request.getParameter("name")!=null && !request.getParameter("name").isEmpty()? request.getParameter("name"):"Rien";
		modMap.put("name", name);
		return "pages/home";
	}

}
