package at.htl.lego.solution.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

// tag::solution[]
public class Bsp004 {
    private static final String[] lines = {
            "Donald;Duck",
            "Dagobert;Duck",
            "Tick;Duck",
            "Trick;Duck",
            "Track;Duck",
            "Daisy;Duck",
            "Gustav;Duck",
            "Dussel;Duck",
            "Oma Dorette;Duck",
            "Franz;Gans"
    };

    private static final String FILENAME = "my-file.txt";


    public static void main(String[] args) {
        int noOfLines = writeTextFile(FILENAME, lines);
        System.out.printf("Wrote %d lines to file '%s'%n", noOfLines, FILENAME);
    }


    public static int writeTextFile(String fileName, String[] lines) {

        int noOfLines = 0;

        try (PrintWriter pw = new PrintWriter(fileName);
        ) {
            for (String line : lines) {
                pw.println(line);
                noOfLines++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return noOfLines;
    }
}
// end::solution[]