package de.okmeis.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RulesController {

	@RequestMapping("/rules")
	public String getMainPage() {
		return "rules";
	}
}