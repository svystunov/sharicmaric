package com.sss.sharicmaric.bean;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by svystunov on 1/9/2015.
 */
public class Position {
    private String name;

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", assignments=" + assignments +
                '}';
    }

    private List<Assignment> assignments;

    public Position(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

}
