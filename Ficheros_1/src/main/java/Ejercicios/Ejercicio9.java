package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio9 {

    // ***** Shows everything in a directory given as an argument and shows specific properties ***** //

    private static Logger log = LoggerFactory.getLogger(Ejercicio9.class);

    public static void showFilesInDirectory(File path){


        File[]files = path.listFiles();

        for (int i = 0; i < files.length; i++) {

            if (files[i].isDirectory()){
                log.info((files[i].getName()));
                showFilesInDirectory(files[i]);
            }else{
                log.info(files[i].getName());
            }

        }

        }


    public static void main(String[] args) {

        File file = new File("C:\\home");

        showFilesInDirectory(file);
    }
}
