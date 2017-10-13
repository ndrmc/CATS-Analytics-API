package com.cats.analytics.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by User on 10/12/2017.
 */
public class Transporter {
    @Id
    private String id;
    private String name;

    public Transporter(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Transporter() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
