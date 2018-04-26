package com.model;

import java.sql.Timestamp;
import java.util.Objects;

public class WaiterComment {
    private int id;
    private String comment;
    private Timestamp dateTime;
    private int waiterId;

    public WaiterComment() {
    }

    public WaiterComment(int id, String comment, Timestamp dateTime, int waiterId) {
        this.id = id;
        this.comment = comment;
        this.dateTime = dateTime;
        this.waiterId = waiterId;
    }

    public int getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public int getWaiterId() {
        return waiterId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WaiterComment that = (WaiterComment) o;
        return id == that.id &&
                waiterId == that.waiterId &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, comment, dateTime, waiterId);
    }

    @Override
    public String toString() {
        return "WaiterComment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", dateTime=" + dateTime +
                ", waiterId=" + waiterId +
                '}';
    }
}
