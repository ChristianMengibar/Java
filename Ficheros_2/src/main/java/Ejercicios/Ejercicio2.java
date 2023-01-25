package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {

    private static Logger log = LoggerFactory.getLogger(Ejercicio2.class);

    public static void readAllFiles1(File path) throws FileNotFoundException {

        File[] files = path.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                readAllFiles1(files[i]);

            } else {
                Scanner scan = new Scanner(files[i]);
                log.info("Reading " + files[i].getName());
                log.info("\n");
                while (scan.hasNextLine()) {
                    log.info(scan.nextLine());

                }
                log.info("\n");
                log.info("\n");

            }

        }

    }

    public static void readAllFiles2(File path) throws IOException {

        File[] files = path.listFiles();

        for (int i = 0; i < files.length; i++) {

            if (files[i].isDirectory()) {
                readAllFiles2(files[i]);

            } else {
                BufferedReader br = new BufferedReader(new FileReader(files[i]));

                String line;
                log.info("Reading " + files[i].getName());

                log.info("\n");

                while ((line = br.readLine()) != null){
                    log.info(line);

                }
                log.info("\n");
                log.info("\n");
            }

        }
    }

    public static void main(String[] args) throws IOException {

        File path = new File("C:\\home");

        readAllFiles1(path);
        readAllFiles2(path);

    }
}
