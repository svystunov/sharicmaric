package com.sss.sharicmaric.bean;

import java.util.Date;

/**
 * Created by svystunov on 1/19/2015.
 */
public class Assignment {
    @Override
    public String toString() {
        return "Assignment{" +
                "from=" + from +
                ", to=" + to +
                ", personId='" + personId + '\'' +
                ", personName='" + personName + '\'' +
                '}';
    }

    private Date from;
    private Date to;
    private String personId;
    private String personName;

    public Assignment(Date from, Date to) {
        this.from = from;
        this.to = to;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

}
