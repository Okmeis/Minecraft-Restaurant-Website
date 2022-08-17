package de.okmeis.restaurant.database.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // This tells the java framework Hibernate to make a table out of this class
public class Food {

    @Id
    private String name;

    private String image;

    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}