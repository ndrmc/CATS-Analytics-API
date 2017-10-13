package com.cats.analytics.domain;

import javax.persistence.Id;

/**
 * Created by User on 10/12/2017.
 */
public class Warehouse {
    @Id
    private int id;
    private String name;

    public Warehouse() {
    }

    public Warehouse(int id, String name) {
        this.id = id;
        this.name = name;
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
}
