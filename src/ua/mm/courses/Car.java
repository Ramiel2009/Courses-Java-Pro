package ua.mm.courses;

import java.io.Serializable;

public class Car implements Cloneable, Serializable{
    private String type;
    private String color;
    private float price;
    private final long serialVersionUID =1l;

    Car(){
        type = "Car";
        color = "White";
        price = (float) 0.0;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }

    public void setType(String type) {

        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(float weight) {
        this.price = weight;
    }

     public Car clone()throws CloneNotSupportedException{
        Car clone = (Car)super.clone();
        return clone;
    }
}
