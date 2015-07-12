package ua.mm.courses;

import java.io.FileWriter;
import java.io.IOException;

public class Output {

    public static String outputPath;

    public static void outputToFile(String value1, String value2, float value3)
            throws IOException {
        FileWriter fw = new FileWriter(outputPath, true);
            fw.write("{Object" + Main.c + "={type=" + value1 + ", color=" + value2 + ", price=" + value3 + "}},");
        fw.write(System.lineSeparator());
        fw.close();
    }
    public static void startOutput() throws IOException {
        FileWriter fw = new FileWriter(outputPath, true);
        fw.write("{");
        fw.close();
    }

    public static void outPrice(float price) throws IOException {
        FileWriter fw = new FileWriter(outputPath, true);
        fw.write("}"+System.lineSeparator() + "Amount price= " + String.valueOf(price));
        fw.close();
    }

}