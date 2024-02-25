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
public class Bsp001 {

    public static void main(String[] args) {
        final String FILENAME = "src/main/java/at/htl/lego/student/files/duck-names.txt";

        // read all lines in String and print to console
        String fileContent = readTextFile(FILENAME);
        try (BufferedReader br = new BufferedReader(new StringReader(fileContent))) {
            String line = null;
            int lineNo = 0;
            while ((line = br.readLine()) != null) {
                System.out.printf("%2d:", ++lineNo);
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readTextFile(String fileName) {
        StringBuilder sb = new StringBuilder();

        try (Scanner scanner = new Scanner(
                Files.newInputStream(
                        Paths.get(fileName)
                ), StandardCharsets.UTF_8)
        ) {

            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
                sb.append(System.lineSeparator());
            }

            return sb.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
// end::solution[]
