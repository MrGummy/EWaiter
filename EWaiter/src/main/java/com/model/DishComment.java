package com.model;

import java.sql.Timestamp;
import java.util.Objects;

public class DishComment {
    private int id;
    private String comment;
    private Timestamp dateTime;
    private int dishId;

    public DishComment() {
    }

    public DishComment(int id, String comment, Timestamp dateTime, int dishId) {
        this.id = id;
        this.comment = comment;
        this.dateTime = dateTime;
        this.dishId = dishId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DishComment that = (DishComment) o;
        return id == that.id &&
                dishId == that.dishId &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, comment, dateTime, dishId);
    }

    @Override
    public String toString() {
        return "DishComment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", dateTime=" + dateTime +
                ", dishId=" + dishId +
                '}';
    }
}
