package ua.mm.courses;

import java.io.IOException;

/**
 * Created by mmaloshtan2 on 23.07.2015.
 */
public class Bike implements Controller {
    private String type = "bike";
    private String color = "red";
    private float price;

    public String getCar(float price) throws IOException {
        this.price = price;
        System.out.println(price);
        System.out.println("Created: " + type + ", Color: "
                + color + ", Price: " + price + "\n");
        Output.outputToFile(type, color, price);
        Main.totalPrice+=price;
        return "bike";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bike bike = (Bike) o;

        if (Float.compare(bike.price, price) != 0) return false;
        if (!type.equals(bike.type)) return false;
        return color.equals(bike.color);

    }

    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        return result;
    }
}
