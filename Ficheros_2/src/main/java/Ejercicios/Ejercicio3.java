package Ejercicios;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Ejercicio3 {


    //This program reads the file that is located in the programs resources//
    //This program is made to only read the files in resources//
    //For example this could be a program that has a bible in resources and works
    //over that file, reading it or searching on it//

    private static Logger log = LoggerFactory.getLogger(Ejercicio3.class);



    public File readFilesFromResources(String path){

        File file = null;

        try {
            file = new File(getClass().getResource(path).toURI());


        }catch (URISyntaxException e){

            e.printStackTrace();
        }
        return file;
    }

    public static void readFile(File file) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));

        StringBuilder builder = new StringBuilder();

            String line;

            while ((line = reader.readLine()) != null) {

                builder.append(line);
                builder.append("\n");
            }

            log.info(builder.toString());



    }

    public static void readFile2(File file) throws IOException {

        Scanner scan = new Scanner(file);

        StringBuilder builder = new StringBuilder();

        while (scan.hasNextLine()){

            builder.append(scan.nextLine());
            builder.append("\n");


        }
    }

    public static void main(String[] args) throws IOException {

        Ejercicio3 readBible = new Ejercicio3();

        File bibleReader = readBible.readFilesFromResources("/el_quijote.txt");

        readFile(bibleReader);






    }




}
