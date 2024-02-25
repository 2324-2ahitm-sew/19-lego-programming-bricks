package at.htl.lego.solution.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

// tag::solution[]
public class Bsp003 {
    private static final String content = "Donald;Duck " + System.lineSeparator() +
            "Dagobert;Duck " + System.lineSeparator() +
            "Tick;Duck " + System.lineSeparator() +
            "Trick;Duck " + System.lineSeparator() +
            "Track;Duck " + System.lineSeparator() +
            "Daisy;Duck " + System.lineSeparator() +
            "Gustav;Duck " + System.lineSeparator() +
            "Dussel;Duck " + System.lineSeparator() +
            "Oma Dorette;Duck " + System.lineSeparator() +
            "Franz;Gans";

    private static final String FILENAME = "my-file.txt";


    public static void main(String[] args) {
        int noOfLines = writeTextFile(FILENAME, content);
        System.out.printf("Wrote %d lines to file '%s'%n", noOfLines, FILENAME);
    }


    public static int writeTextFile(String fileName, String content) {

        int noOfLines = 0;

        try (BufferedReader br = new BufferedReader(new StringReader(content));
             PrintWriter pw = new PrintWriter(fileName);
        ) {
            String line = "";
            while ((line = br.readLine()) != null) {
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