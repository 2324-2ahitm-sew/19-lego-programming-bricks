package at.htl.lego.solution.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Bsp005 {

    // tag::solution[]
    public static void main(String[] args) {

        // Wird die Datei nicht gefunden, wird eine unchecked exception geworfen → InvalidPathException
        // Daher müssen diese 2 Kommandos nicht in den try-catch-Block eingebettet werden, da sie keine checked exception werfen.
        Path src = Paths.get(System.getProperty("user.dir"), "pom.xml");
        Path dst = Paths.get(System.getProperty("user.dir"), "files", "pom-copy.xml");

        // oder auch (da das Projektroot standardmäßig das Working Directory ist):
        // Path src = Paths.get("pom.xml");
        // Path dst = Paths.get("files", "pom-copy.xml");

        try {
            Files.copy(src, dst);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    // end::solution[]
}
