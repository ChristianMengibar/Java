package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio3 {

    // ***** Shows everything that is in the user directory ***** //

    private static Logger log = LoggerFactory.getLogger(Ejercicio3.class);

    public static void showFiles(File path) {

        File[] files = path.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                log.info("[ DIRECTORY ]" + files[i]);
                showFiles(files[i]);

            } else {
                log.info("[ FILE ]");
                log.info(String.valueOf(files[i]));


            }

        }
    }


    public static void main (String[]args){

        File path = new File(".");
        showFiles(path);

    }
}



