package com.example.demo;

public class FarewellObject {
    private String name;
    private String message;

    public FarewellObject() {}

    public FarewellObject(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
