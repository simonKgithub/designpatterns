package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._01_before;

public class Ship {
    private String name;
    private String color;
    private String logo;

    public Ship(String name, String color, String logo) {
        this.name = name;
        this.color = color;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getLogo() {
        return logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
