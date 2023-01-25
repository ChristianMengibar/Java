package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Scanner;

public class Ejercicio5 {
    //This program asks you for a word and searches for that word in a file
    //you gave and writes the number of times the word appears in another file
    //Method that ask for the path and file in which we want to search
    //Method that asks for the word
    //Method that searches for the word and uses a counter to keep the number
    //This method also uses a Buffered reader
    //The number is turned to a string in order to be written on the file later
    //Method that asks for the path of the file where the number will be kept
    //and asks for the name of the file.
    //This method creates a file in the path you gave and with the name you gave
    //This method uses a Buffered writer and writes the number in the file
    //*Only counts the lines in which the words show and not the actual amount of words

    static Scanner scan = new Scanner(System.in);

    private static Logger log = LoggerFactory.getLogger(Ejercicio5.class);


    public static File askpathNameAndFile() {

        log.info("Type the path and file to search on");
        String pathName = scan.next();
        File path = new File(pathName);

        while (!path.exists()) {
            if (path.exists()) {

                log.info("File found");
            } else {
                log.info("File not found");
                log.info("Try again");
                pathName = scan.next();
                path = new File(pathName);

            }
        }

        return path;
    }

    public static String textToFind() {
        log.info("Type the word you want to search for");
        String text = scan.next();

        return text;

    }

    public static int getNumberOfTimes(File file, String text) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;

        int contador = 0;

        while ((line = br.readLine()) != null) {

            String[] parts = line.split(" ");
            for (String part : parts) {
                if (part.equals(text)) {

                    contador++;
                }

            }
        }

        return contador;
    }

    public static void writeTheNumberOnNewFile(int number) throws IOException {

        log.info("Type the path where you want to put the new file");
        String pathName = scan.next();
        File path = new File(pathName);

        while (!path.exists()) {
            if (path.exists()) {

                log.info("Path found");
            } else {
                log.info("Path not found");
                log.info("Try again");
                pathName = scan.next();
                path = new File(pathName);

            }
        }


        log.info("Type the name of the file to keep the number");
        String newFile = scan.next();
        File theNewFile = new File(path + "\\" + newFile + ".txt");

        theNewFile.createNewFile();

        BufferedWriter br = new BufferedWriter(new FileWriter(theNewFile));

        String num = String.valueOf(number);

        br.write(num);
        br.close();


    }

    public static void main(String[] args) throws IOException {
        File file = askpathNameAndFile();

        String text = textToFind();

        int numberToWrite = getNumberOfTimes(file, text);

        writeTheNumberOnNewFile(numberToWrite);

    }


}
