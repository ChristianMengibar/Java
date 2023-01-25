package org.iesfm.accesoadatos;

import java.io.File;
import java.io.IOException;

public class Ejercicio8 {

    public static void createDirectory(String directoryName){

        File path = new File(directoryName);
        path.mkdir();

    }

    public static void createFile(String directory, String fileName) throws IOException {

        File file = new File(directory + "\\" + fileName);

        file.createNewFile();


    }

    public static void main(String[] args) throws IOException {

        createDirectory("C:\\home");
        createDirectory("C:\\home\\usr1");
        createFile("C:\\home\\usr1\\",  "f1.txt");
        createDirectory("C:\\home\\usr2");
        createDirectory("C:\\home\\d1");
        createFile("C:\\home\\d1\\",  "f2.txt");
        createDirectory("C:\\home\\d2");
        createFile("C:\\home\\d2\\",  "f3.txt");
        createFile("C:\\home\\d2\\",  "f4.txt");
        createDirectory("C:\\home\\d3");


    }


}

