package com.model;

import java.io.Serializable;

public class RequestDTO implements Serializable {

    private String data;

    private Integer id;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
