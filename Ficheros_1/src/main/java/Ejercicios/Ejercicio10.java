package Ejercicios;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


import java.io.File;


public class Ejercicio10 {

    // ***** Shows everything that is in the home directory, showing the names and the type of each ***** //

    private static Logger log = LoggerFactory.getLogger(Ejercicio10.class);

    public static void showFilesInDirectory(File path) {


        File[] files = path.listFiles();

        for (int i = 0; i < files.length; i++) {

            if (files[i].isDirectory()) {
                log.info("[ DIRECTORY ]" + files[i]);
                showFilesInDirectory(files[i]);
            } else {
                log.info("[ FILE ]");
                log.info(files[i].getName());
            }

        }

    }

    public static void main(String[] args) {

        File file = new File("C:\\home");

        showFilesInDirectory(file);
    }
}
