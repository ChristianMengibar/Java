package org.iesfm.accesoadatos;

import java.io.File;
import java.io.IOException;

public class Ejercicio4_1 {

    public static void createDirectory(String FolderName) {

        File path = new File("C:\\" + FolderName);

        path.mkdir();

    }

    public static void createFile(String directory,String fileName) throws IOException {

        File path = new File("C:\\" + directory + "\\" + fileName);

        path.createNewFile();


    }

    public static void main(String[] args) throws IOException {
        createDirectory("ejercicio");
        createDirectory("ejercicio\\apuntes");
        createDirectory("ejercicio\\docs");
        createDirectory("ejercicio\\docs\\excel");
        createDirectory("ejercicio\\docs\\word");
        createFile("ejercicio\\docs\\excel\\", "excel.xlsx");
        createFile("ejercicio\\docs\\word\\", "word.docx");
        createDirectory("ejercicio\\principal");
        createDirectory("ejercicio\\principal\\programas");
        createDirectory("ejercicio\\sistemas");
    }
}
