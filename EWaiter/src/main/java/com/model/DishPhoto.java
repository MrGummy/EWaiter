package com.model;

import java.net.URL;
import java.util.Objects;

public class DishPhoto {
    private int id;
    private String url;

    public DishPhoto() {
    }

    public DishPhoto(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DishPhoto dishPhoto = (DishPhoto) o;
        return id == dishPhoto.id &&
                Objects.equals(url, dishPhoto.url);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, url);
    }

    @Override
    public String toString() {
        return "DishPhoto{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
