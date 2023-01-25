package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;


public class Ejercicio6 {

    // ***** Methods that show the properties of files and directories ***** //

    private static Logger log = LoggerFactory.getLogger(Ejercicio6.class);

    private static void showProperties(String fileName) {

        File file = new File(fileName);

        log.info("Name: " + file.getName());
        log.info("Absolute path: " + file.getAbsolutePath());
        log.info("Size: " + file.length());
        if (file.isFile()) {
            log.info("Its a file");
        } else if (file.isDirectory()) {
            log.info("Its a directory");
        }
        log.info("Last modification: " + file.lastModified());
        log.info("Writing permission: " + file.canWrite());
        log.info("Reading permission: " + file.canWrite());
        log.info("Executing permission: " + file.canWrite());

    }

    public static void main(String[] args) {

        File filename = new File(args[0]);

        showProperties("C:\\tmp\\d1\\" + filename);
    }


}
