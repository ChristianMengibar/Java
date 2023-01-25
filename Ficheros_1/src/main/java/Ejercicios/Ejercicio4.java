package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class Ejercicio4 {

    // ***** Creates files and directories ***** //

    private static Logger log = LoggerFactory.getLogger(Ejercicio4.class);

    public static void createFolder(String folderName) {

        File folder = new File("C:\\" + folderName );
        //File folder = new File("C:\\Users\\MichaelObinnaEzehEro\\Desktop\\" + folderName);
        folder.mkdir();

    }

    public static void createFile(String folderToPlace, String FileName) throws IOException {
        File file = new File("C:\\"+  folderToPlace + "\\" + FileName);
        //File file = new File("C:\\Users\\MichaelObinnaEzehEro\\Desktop\\" + folderToPlace + "\\" + FileName);

        file.createNewFile();


    }


    public static void main(String[] args) throws IOException {
        createFolder("tmp");

        createFolder("tmp\\d2");

        createFolder("tmp\\d1");

        //createFolder("tmp\\ejemplo");

        createFile("tmp\\d1", "f11.txt");

        createFile("tmp\\d2", "f21.txt");

        //createFile("tmp\\ejemplo","holamundo.txt");
    }
}
