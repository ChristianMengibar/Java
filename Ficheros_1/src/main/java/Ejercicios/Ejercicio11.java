package Ejercicios;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.File;
import java.util.Scanner;


public class Ejercicio11 {

    // ***** Deletes all the files asking first for confirmation ***** //
    private static Scanner scan = new Scanner(System.in);
    private static Logger log = LoggerFactory.getLogger(Ejercicio11.class);

    public static void deleteAll(File path) {

        File[] files = path.listFiles();

        for (int i = 0; i < files.length; i++) {

            if (files[i].isDirectory()) {
                deleteAll(files[i]);

                log.info("Are you sure you want to delete this directory " + files[i].getName());
                String decision = scan.next();
                if (decision.equalsIgnoreCase("yes")) {
                    files[i].delete();
                } else if (decision.equalsIgnoreCase("no")) {
                    log.info(files[i].getName() + " wont be deleted");
                }
            } else if (files[i].isFile()) {
                log.info("Are you sure you want to delete this file " + files[i].getName());
                String decision = scan.next();
                if (decision.equalsIgnoreCase("yes")) {
                    files[i].delete();
                } else if (decision.equalsIgnoreCase("no")) {
                    log.info(files[i].getName() + " wont be deleted");
                }

            }


        }
    }

    public static void main(String[] args) {

        File file = new File("C:\\tmp");

        deleteAll(file);
    }
}
