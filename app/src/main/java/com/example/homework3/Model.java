package com.example.homework3;

public class Model {
    private int image;
    private String name;
    private String nameTwo;

    public Model(int image, String name, String nameTwo) {
        this.image = image;
        this.name = name;
        this.nameTwo = nameTwo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }
}
