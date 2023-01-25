package Ejercicios;

import java.io.*;
import java.net.URISyntaxException;

public class Ejercicio4 {

    //In this program the goal is to copy a file from directory to another
    //There isn't any method such as copy, so we actually don't copy it
    //What we do is to get the file we want to copy, in this case from the classpath
    //We keep the content in a builder with a buffered reader
    //We create the file we want to copy with the same name in the directory we want
    //And we write it on the file using the buffered writer and the builder of the original file
    //*Exercises 3 and 4 only accept the files in classpath that are dragged and not copied

    public File getClassFilePath(String path){

        File file = null;

        try {
            file = new File(getClass().getResource(path).toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return file;


    }

    public static StringBuilder readFile(File file) throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader(file));

        StringBuilder builder = new StringBuilder();

        String line;

        while ( (line = bf.readLine()) != null){

            builder.append(line).append("\n");


        }
        bf.close();

        return builder;
    }

    public static File creteFileWhereToCopy(String pathAndFile) throws IOException {

        File file = new File(pathAndFile);

        file.createNewFile();

        return file;


    }

    public static void writeFile(StringBuilder builderToCopy,File file) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        bw.write(builderToCopy.toString());

        bw.close();


    }

    public static void main(String[] args) throws IOException {

        Ejercicio4 ejercicio4 = new Ejercicio4();

        File file = ejercicio4.getClassFilePath("/Eladio Carrion Bzrp Music Sessions, Vol. 40.txt");

        StringBuilder builder = readFile(file);

        File file2 = creteFileWhereToCopy("C:\\tmp\\Eladio Carrion Bzrp Music Sessions, Vol. 41.txt");

        writeFile(builder,file2);

    }
}
