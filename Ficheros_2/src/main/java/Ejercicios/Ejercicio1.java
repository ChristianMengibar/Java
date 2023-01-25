package Ejercicios;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.util.Scanner;


public class Ejercicio1 {

    private static Logger log = LoggerFactory.getLogger(Ejercicio1.class);
    private static Scanner scan = new Scanner(System.in);
    //Lee lo que hay en un fichero y lo imprime en pantalla//

    public static File getFileToRead(String fileName) {

        File file = new File(fileName);

        return file;
    }

    public static void readFile1(File file) throws IOException {

        BufferedReader rd = new BufferedReader(new FileReader(file));

        String line;

        while ((line = rd.readLine()) != null) {

            log.info(line);
        }
    }

    public static void readFile2(File file) throws FileNotFoundException {

        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()){

            log.info(scan.nextLine());

        }



    }

    public static File askForPath() {

        String inputPath;
        log.info("Type the path of your file");
        inputPath = scan.next();
        File path = new File(inputPath);

            if (path.exists()) {
                log.info("Path found");

            } else {
                log.info("Path not found, try again");
                askForPath();

            }

        return path;
    }

    public static File askForFile() {

        File path = askForPath();
        log.info("Type the name of your file");
        String file = scan.next();
        File file1 = new File(path + "\\" + file);


        while (!file1.exists()) {


            if (file1.exists()) {
                log.info(file1.getName() + "was found");

            } else {

                log.info(file1.getName() + "wasn't found");
                log.info("Try again");
                file = scan.next();
                file1 = new File(path + "\\" + file);


            }
        }

        return file1;
    }

    public static void main(String[] args) throws IOException {

        File path = askForFile();

       readFile1(path);

        readFile2(path);


    }


}

