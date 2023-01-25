package Ejercicios;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.util.Scanner;


public class Ejercicio7 {

    private static Logger log = LoggerFactory.getLogger(Ejercicio7.class);

    static Scanner scan = new Scanner(System.in);

    public static File askForPathAndFile(){

        log.info("Type the path of the file you want to read");
         String filePath = scan.next();

         File file = new File(filePath);

         if (file.exists()){
             log.info(file.getName() + " found");

         }else{
             log.info("The file wasn't found");
             log.info("Try again");

             askForPathAndFile();

         }

         return file;

    }
    /*
    public static StringBuilder getAllWords(File file) throws IOException {

        StringBuilder builder = new StringBuilder();

        BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null){

                String [] words = line.split(" ");

                for (String word : words) {



                    builder.append(word);
                    builder.append("\n");

                }




            }









    }
    */



}
