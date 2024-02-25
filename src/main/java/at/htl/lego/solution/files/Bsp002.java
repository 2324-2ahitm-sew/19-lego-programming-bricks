package at.htl.lego.solution.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * https://howtodoinjava.com/java/io/java-write-to-file/
 * https://www.digitalocean.com/community/tutorials/java-read-file-line-by-line
 */
// tag::solution[]
public class Bsp002 {

    public static void main(String[] args) {
        final String FILENAME = "src/main/java/at/htl/lego/student/files/duck-names.txt";

        // read all lines in string-array and print to console
        String[] fileContent = readTextFile(FILENAME);
        for (int i = 0; i < fileContent.length; i++) {
            System.out.printf("%2d:", i + 1);
            System.out.println(fileContent[i]);
        }
    }

    public static String[] readTextFile(String fileName) {

        int noOfLines = countLines(fileName);
        String[] lines = new String[noOfLines];

        try (Scanner scanner = new Scanner(
                Files.newInputStream(
                        Paths.get(fileName)
                ), StandardCharsets.UTF_8)) {
            int i = 0;
            while (scanner.hasNextLine()) {
                lines[i++] = scanner.nextLine();
            }
            return lines;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int countLines(String fileName) {
        int lineCount = 0;
        try (Scanner scanner = new Scanner(
                Files.newInputStream(
                        Paths.get(fileName)
                ), StandardCharsets.UTF_8)
        ) {
            while (scanner.hasNextLine()) {
                lineCount++;
                scanner.nextLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lineCount;
    }
}
// end::solution[]
