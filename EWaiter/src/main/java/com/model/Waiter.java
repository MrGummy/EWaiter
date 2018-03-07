package com.model;

import java.util.List;
import java.util.Objects;

public class Waiter {
    private int id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String photo;
    private List<WaiterComment> comments;

    public Waiter() {
    }

    public Waiter(int id, String firstName, String lastName, String login, String password, String photo, List<WaiterComment> comments) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.photo = photo;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<WaiterComment> getComments() {
        return comments;
    }

    public void setComments(List<WaiterComment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Waiter waiter = (Waiter) o;
        return id == waiter.id &&
                Objects.equals(firstName, waiter.firstName) &&
                Objects.equals(lastName, waiter.lastName) &&
                Objects.equals(login, waiter.login) &&
                Objects.equals(password, waiter.password) &&
                Objects.equals(photo, waiter.photo) &&
                Objects.equals(comments, waiter.comments);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, login, password, photo, comments);
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", photo='" + photo + '\'' +
                ", comments=" + comments +
                '}';
    }
}
