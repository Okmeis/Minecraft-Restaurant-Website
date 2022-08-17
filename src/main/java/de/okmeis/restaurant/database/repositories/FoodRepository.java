package de.okmeis.restaurant.database.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import de.okmeis.restaurant.database.model.Food;


public interface FoodRepository extends CrudRepository<Food, Integer> {

    @Override
    List<Food> findAll();

    List<Food> findAllByName(String term);
}