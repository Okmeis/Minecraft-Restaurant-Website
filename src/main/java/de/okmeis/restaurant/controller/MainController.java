package de.okmeis.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping({"/", "/main", "/start", "/home"})
	public String getMainPage() {
		return "main";
	}

}