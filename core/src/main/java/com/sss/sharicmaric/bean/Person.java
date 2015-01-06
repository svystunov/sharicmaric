package com.sss.sharicmaric.bean;

import org.springframework.data.annotation.Id;

/**
 * Created by netcrk on 1/2/15.
 */

public class Person {
    @Id
    private String  id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
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
