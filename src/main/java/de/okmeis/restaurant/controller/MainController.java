package de.okmeis.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String getMainPage() {
		return "main";
	}

	@RequestMapping("/main")
	public String getMainPage2() {
		return "main";
	}

	@RequestMapping("/start")
	public String getMainPage3() {
		return "main";
	}

	@RequestMapping("/home")
	public String getMainPage4() {
		return "main";
	}

}