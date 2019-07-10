package com.kenta.tabuchi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@Autowired
	NoteRepository repository;
	@GetMapping("/")
	public ModelAndView index_get(ModelAndView view) {
		
		view.addObject("notes",repository.findAll());
		view.setViewName("index");

		return view;
	}

}