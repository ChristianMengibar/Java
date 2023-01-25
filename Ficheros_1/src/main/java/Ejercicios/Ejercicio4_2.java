package Ejercicios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class Ejercicio4_2 {

    // ***** Creates files and directories ***** //

    private static Logger log = LoggerFactory.getLogger(Ejercicio4_2.class);

    public static void createDirectory(String foldername) {
        File path = new File("C:\\Users\\UsuarioPC\\Desktop\\" + foldername);
        //File path = new File("C:\\Users\\MichaelObinnaEzehEro\\Desktop\\" + foldername);
        path.mkdir();


    }

    public static void createFile(String folder, String fileName) throws IOException {
        File path = new File("C:\\Users\\UsuarioPC\\Desktop\\" + folder + "\\" + fileName);
        //File path = new File("C:\\Users\\MichaelObinnaEzehEro\\Desktop\\" + folder + "\\" + fileName);

        path.createNewFile();
    }


    public static void main(String[] args) throws IOException {

        createDirectory("Exercise_Access_To_Data");
        createDirectory("Exercise_Access_To_Data\\1_First_Directory");
        createDirectory("Exercise_Access_To_Data\\2_Second_Directory");
        createFile("Exercise_Access_To_Data\\2_Second_Directory\\", "file5.txt");
        createDirectory("Exercise_Access_To_Data\\1_First_Directory\\Section1");
        createDirectory("Exercise_Access_To_Data\\1_First_Directory\\Section2");
        createFile("Exercise_Access_To_Data\\1_First_Directory\\Section1\\", "file1.txt");
        createFile("Exercise_Access_To_Data\\1_First_Directory\\Section1\\", "file2.txt");
        createFile("Exercise_Access_To_Data\\1_First_Directory\\Section2\\", "File3.txt");
        createFile("Exercise_Access_To_Data\\1_First_Directory\\Section2\\", "File4.txt");
    }
}

