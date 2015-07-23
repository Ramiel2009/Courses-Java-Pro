package ua.mm.courses;

import java.io.IOException;

/**
 * Created by mmaloshtan2 on 23.07.2015.
 */
public class Truck implements Controller {
    private String type = "truck";
    private String color = "white";
    private float price;
    public String getCar(float price) throws IOException{
        this.price = price;
        System.out.println(price);
        System.out.println("Created: " + type + ", Color: "
                + color + ", Price: " + price + "\n");
        Output.outputToFile(type, color, price);
        System.out.println(price);
        Main.totalPrice+=price;
        return "truck";
    }
}
