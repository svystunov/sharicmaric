package com.sss.sharicmaric.bean;

import org.springframework.data.annotation.Id;

/**
 * Created by svystunov on 1/9/2015.
 */
public class Position {
    @Id
    private String id;
    private String name;

    public Position(String name) {
        this.name = name;
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
