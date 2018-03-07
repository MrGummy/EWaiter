package com.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Company {
    private int id;
    private String name;
    private String login;
    private String password;
    private List<Menu> menus;
    private Date regDate;

    public Company() {
    }

    public Company(int id, String name, String login, String password, List<Menu> menus, Date regDate) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.menus = menus;
        this.regDate = regDate;
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

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id &&
                Objects.equals(name, company.name) &&
                Objects.equals(login, company.login) &&
                Objects.equals(password, company.password) &&
                Objects.equals(menus, company.menus) &&
                Objects.equals(regDate, company.regDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, login, password, menus, regDate);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", menus=" + menus +
                ", regDate=" + regDate +
                '}';
    }
}
