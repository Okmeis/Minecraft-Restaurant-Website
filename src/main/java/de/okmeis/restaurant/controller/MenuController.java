package de.okmeis.restaurant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import de.okmeis.restaurant.database.model.Food;
import de.okmeis.restaurant.database.repositories.FoodRepository;
import de.okmeis.restaurant.exceptions.ValueNotValid;
import de.okmeis.restaurant.services.AddToMenuValidationService;
import de.okmeis.restaurant.services.MenuService;

@Controller
public class MenuController {

    @Autowired
    AddToMenuValidationService addToMenuValidationService;

    @Autowired
    private MenuService menuservice;

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping("/addtomenu")
    public String getNewItem(Model model) {
        model.addAttribute("name", "");
        model.addAttribute("image", "");
        model.addAttribute("price", "");
        return "addtomenu";
    }

    @PostMapping(path="/addtomenu")
    public String addNewFood(Model model, @RequestParam String image, @RequestParam String name, @RequestParam Integer price) {
            
            //if formular of template gets whiped, data is safe
            model.addAttribute("name",name);
            model.addAttribute("image",image);
            model.addAttribute("price", price);

            // Validation
            try {
                addToMenuValidationService.validateName(name, model, foodRepository.findAllByName(name));
                addToMenuValidationService.validateImage(image, model);
                addToMenuValidationService.validatePrice(price, model);
            } catch (ValueNotValid e) {
                return "addtomenu";
            }

            Food food = new Food();
            food.setName(name);
            food.setImage(image.toLowerCase());
            food.setPrice(price);
            
            foodRepository.save(food);

            return "addtomenu";
        }

        @GetMapping("/menu")
        public String getMenu(Model model) {
            //returns all foods to the menu template
            model.addAttribute("menu", menuservice.getFoodList());
            return "menu";
        }
}