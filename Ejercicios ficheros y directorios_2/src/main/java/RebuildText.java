import java.io.*;
import java.util.Scanner;

public class RebuildText {

    public static void reconstruirTexto(String path) throws IOException {

        File file1 = new File(path);

        StringBuilder builder = new StringBuilder();

        BufferedReader bf = new BufferedReader(new FileReader(file1));

        String line;

        while ((line = bf.readLine()) != null){

            builder.append(line).append("\n");

        }

        System.out.println(builder);




    }

    public static void main(String[] args) throws IOException {

        reconstruirTexto("C:\\Users\\UsuarioPC\\OneDrive - I.E.S. Federica Montseny\\DAM\\SEGUNDO AÑO\\PROGRAMACIÓN DE SERVICIOS Y PROCESOS\\Buscador\\src\\main\\resources\\el_quijote.txt");
    }
}
