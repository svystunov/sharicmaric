package com.sss.sharicmaric.bean;

import java.util.Date;

/**
 * Created by svystunov on 1/19/2015.
 */
public class Assignment {
    String id;
    Date from;
    Date to;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
