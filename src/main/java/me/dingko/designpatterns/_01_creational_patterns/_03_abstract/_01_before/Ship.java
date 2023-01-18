package me.dingko.designpatterns._01_creational_patterns._03_abstract._01_before;

public class Ship {
    private String name;
    private String color;
    private String logo;
    private WhiteAnchor anchor;
    private WhiteWheel wheel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public WhiteAnchor getAnchor() {
        return anchor;
    }

    public void setAnchor(WhiteAnchor anchor) {
        this.anchor = anchor;
    }

    public WhiteWheel getWheel() {
        return wheel;
    }

    public void setWheel(WhiteWheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString(){
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                ", anchor='" + anchor + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
