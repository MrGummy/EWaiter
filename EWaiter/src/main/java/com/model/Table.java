package com.model;

import java.util.Objects;

public class Table {
    private int id;
    private String scheme;

    public Table() {
    }

    public Table(int id, String scheme) {
        this.id = id;
        this.scheme = scheme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return id == table.id &&
                Objects.equals(scheme, table.scheme);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, scheme);
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", scheme='" + scheme + '\'' +
                '}';
    }
}
