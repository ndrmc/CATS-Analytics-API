package com.cats.analytics.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by User on 10/11/2017.
 */
@Document(collection = "dispatches")
public class Dispatch  {
    @Id
    private String id;
    private Object data;

    public Dispatch() {
    }

    public Dispatch(String id, Object object) {
        this.id = id;
        this.data = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getObject() {
        return data;
    }

    public void setObject(Object object) {
        this.data = object;
    }
}
