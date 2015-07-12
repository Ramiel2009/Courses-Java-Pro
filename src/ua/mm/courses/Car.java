package ua.mm.courses;

public class Car {
    private String type;
    private String color;
    private float price;
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
}
