package com.model;

import java.util.List;
import java.util.Objects;

public class Category {
    private int id;
    private String name;
    private String description;
    private List<Dish> dishes;
    private String photo;

    public Category() {
    }

    public Category(int id, String name, String description, List<Dish> dishes, String photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dishes = dishes;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id == category.id &&
                Objects.equals(name, category.name) &&
                Objects.equals(description, category.description) &&
                Objects.equals(dishes, category.dishes) &&
                Objects.equals(photo, category.photo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, dishes, photo);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dishes=" + dishes +
                ", photo='" + photo + '\'' +
                '}';
    }
}
