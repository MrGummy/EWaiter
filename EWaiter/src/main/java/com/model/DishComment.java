package com.model;

import java.util.Date;
import java.util.Objects;

public class DishComment {
    private int id;
    private String comment;
    private Date date;

    public DishComment() {
    }

    public DishComment(int id, String comment, Date date) {
        this.id = id;
        this.comment = comment;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DishComment that = (DishComment) o;
        return id == that.id &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, comment, date);
    }

    @Override
    public String toString() {
        return "DishComment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
