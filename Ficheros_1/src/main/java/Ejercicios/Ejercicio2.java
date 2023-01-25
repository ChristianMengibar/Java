package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio2 {

    // ***** Shows the actual directory path ***** //

    private static Logger log = LoggerFactory.getLogger(Ejercicio2.class);


    public static void main(String[] args) {

        File path = new File(".");
        log.info(path.getAbsolutePath());

    }



}
