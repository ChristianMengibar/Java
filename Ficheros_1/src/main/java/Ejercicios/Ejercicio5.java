package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Ejercicio5 {

    // ***** Renames, relocates and deletes files and directories ***** //

    private static Logger log = LoggerFactory.getLogger(Ejercicio6.class);

    public static void renameFile(String fileName,String newName){

        File file = new File(fileName);
        File fileNewName = new File(newName);

        file.renameTo(fileNewName);


    }

    public static void changeFileLocation(String fileName, String destination){
         File file = new File(fileName);

         File path = new File(destination);

         file.renameTo(path);



    }

    public static void deleteDirectory(String directoryName){

        File directory = new File(directoryName);

        directory.delete();

    }

    public static void main(String[] args) {

        renameFile("C:\\tmp\\d1\\f11.txt","C:\\tmp\\d1\\f12.txt");

       changeFileLocation("C:\\tmp\\d2\\f21.txt","C:\\tmp\\d1\\f21.txt");

        deleteDirectory("C:\\tmp\\d2");


    }

}