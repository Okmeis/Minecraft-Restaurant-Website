package de.okmeis.restaurant.exceptions;

import org.springframework.ui.Model;

public class ValueNotValid extends RuntimeException {
    public ValueNotValid(String message, Model model) {
        model.addAttribute("messageError", message);
    }
}
