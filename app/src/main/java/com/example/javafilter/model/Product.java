package com.example.javafilter.model;

public class Product {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Product() {
    }
}
