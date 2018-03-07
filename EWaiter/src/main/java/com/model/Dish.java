package com.model;

import java.util.List;
import java.util.Objects;

public class Dish {
    private int id;
    private String name;
    private String description;
    private int weight;
    private int price;
    private String cookTime;
    private List<DishPhoto> photos;
    private List<DishComment> comments;

    public Dish() {
    }

    public Dish(int id, String name, String description, int weight, int price, String cookTime, List<DishPhoto> photos, List<DishComment> comments) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.price = price;
        this.cookTime = cookTime;
        this.photos = photos;
        this.comments = comments;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCookTime() {
        return cookTime;
    }

    public void setCookTime(String cookTime) {
        this.cookTime = cookTime;
    }

    public List<DishPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<DishPhoto> photos) {
        this.photos = photos;
    }

    public List<DishComment> getComments() {
        return comments;
    }

    public void setComments(List<DishComment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return id == dish.id &&
                weight == dish.weight &&
                price == dish.price &&
                Objects.equals(name, dish.name) &&
                Objects.equals(description, dish.description) &&
                Objects.equals(cookTime, dish.cookTime) &&
                Objects.equals(photos, dish.photos) &&
                Objects.equals(comments, dish.comments);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, weight, price, cookTime, photos, comments);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", cookTime='" + cookTime + '\'' +
                ", photos=" + photos +
                ", comments=" + comments +
                '}';
    }
}
