package ua.mm.courses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile { //read input file

    public static String[] getText(String path) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            String rawText = line.toString();
            String [] values = rawText.split(";");
        return values;
    }
}
