import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class BufferedReaderExample {
    private static Logger log = LoggerFactory.getLogger(BufferedReaderExample.class);

    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("que quieres buscar");
        String buscado = scan.nextLine();

        try {
            int contador = Buscador.Busqueda(buscado);
            log.info(String.valueOf(contador));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}


