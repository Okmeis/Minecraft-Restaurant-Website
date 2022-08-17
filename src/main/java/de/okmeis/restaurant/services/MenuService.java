package de.okmeis.restaurant.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import de.okmeis.restaurant.database.model.Food;
import de.okmeis.restaurant.database.repositories.FoodRepository;

@Component
public class MenuService {

    @Autowired
    FoodRepository food;

    //List of all Meals, Drinks and Alcoholic Drinks
    public List<Food> getFoodList() {
        return food.findAll();
    }
}
