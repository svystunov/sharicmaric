package com.sss.sharicmaric.bean;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by svystunov on 1/9/2015.
 */
public class Project {
    @Id
    private String id;
    private String name;

    private List<Position> positions;

    public Project(String name) {
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

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
}
