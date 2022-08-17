package de.okmeis.restaurant.services;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import de.okmeis.restaurant.database.model.Food;
import de.okmeis.restaurant.exceptions.ValueNotValid;

@Component
public class AddToMenuValidationService {
    
    public void validateName(String name, Model model, List<Food> menu) {
        if(name == null || name.trim().length() < 4 || name.trim().length() > 9) {
            throw new ValueNotValid("The Item requires a name length between 4 and 18.", model);
        }
        if(menu.size()>0) {
            throw new ValueNotValid("There's already an item with this name.", model);        
        }
    }

    public void validateImage(String image, Model model)  {
    if (image == null || (!image.equalsIgnoreCase("Meal") && !image.equalsIgnoreCase("Drink") && !image.equalsIgnoreCase("Alcohol")) ) {
        throw new ValueNotValid("The Items price is required to be between 1 and 25 copper coins.", model);
        }
    }

    public void validatePrice(Integer price, Model model)  {
    if (price == null || price < 1 || price > 25) {
        throw new ValueNotValid("The Items price is required to be between 1 and 25 copper coins.", model);
        }
    }
}
