package ua.mm.courses;

import java.io.IOException;

/**
 * Created by mmaloshtan2 on 23.07.2015.
 */
public class Sedan extends Car implements Controller {
    private String type = "Sedan";
    private String color = "White";
    private float price;
    public String getCar(float price) throws IOException {
        this.price = price;
        System.out.println(price);
        System.out.println("Created: " + type + ", Color: "
                + color + ", Price: " + price + "\n");
        Output.outputToFile(type, color, price);
        Main.totalPrice+=price;
        return "sedan";
    }
}
