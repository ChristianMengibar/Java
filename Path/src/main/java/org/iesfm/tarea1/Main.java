package org.iesfm.tarea1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static final Scanner scan = new Scanner(System.in);

    public static String getName() {
        log.info("Introduce su nombre: ");
        String name = scan.nextLine();
        return name;
    }

    public static File getPath() {
        log.info("Introduce una ruta: ");
        String path = scan.nextLine();
        File file = new File(path);
        return file;
    }

    public static void register(String user, File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            boolean checkLine = false;
            while ((line = bufferedReader.readLine()) != null) { //line = y va guardando cada linea en line
                if (line.contains(user)) {
                    log.info("El usuario ya esta registrado!");

                    checkLine = true;
                }
            }
            if (checkLine == false) {
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("\n" + user);
                bufferedWriter.close();
                log.info("Usuario registrado correctamente!");
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String name = getName();
        File file = getPath();
        register(name, file);
    }
}