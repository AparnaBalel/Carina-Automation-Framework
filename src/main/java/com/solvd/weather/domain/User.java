package com.solvd.weather.domain;

public class User {
    private int id;
    private int page;

    public int getPage() {
        return page;
    }

    public Object setPage(int page) {
        this.page = page;
        return page;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
