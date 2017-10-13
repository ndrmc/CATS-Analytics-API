package com.cats.analytics.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by User on 10/12/2017.
 */
public class Project {
    @Id
    private String id;
    private String project_code;

    public Project() {
    }

    public Project(String id, String project_code) {
        this.id = id;
        this.project_code = project_code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProject_code() {
        return project_code;
    }

    public void setProject_code(String project_code) {
        this.project_code = project_code;
    }
}
