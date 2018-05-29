package com.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Menu {
    private int id;
    private String name;
    private String description;
    private List<Category> categories;
    private Date date;
    private String photo;

    public Menu() {
    }

    public Menu(int id, String name, String description, List<Category> categories, Date date, String photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categories = categories;
        this.date = date;
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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        Menu menu = (Menu) o;
        return id == menu.id &&
                Objects.equals(name, menu.name) &&
                Objects.equals(description, menu.description) &&
                Objects.equals(categories, menu.categories) &&
                Objects.equals(date, menu.date) &&
                Objects.equals(photo, menu.photo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, categories, date, photo);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", categories=" + categories +
                ", date=" + date +
                ", photo='" + photo + '\'' +
                '}';
    }
}
