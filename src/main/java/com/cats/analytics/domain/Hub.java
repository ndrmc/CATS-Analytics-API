package com.cats.analytics.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by User on 10/12/2017.
 */
public class Hub {
    @Id
    private int id;
    private String name;
    public Hub(){

    }
    public Hub(String name) {

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
