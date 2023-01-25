import java.io.*;

public class CopyFile {

    public static void copyAFile(String origin, String destination) throws IOException {

        File file = new File(origin);

        BufferedReader bf = new BufferedReader(new FileReader(file));

        StringBuilder builder = new StringBuilder();

        String line;

        while ((line = bf.readLine()) != null){

            builder.append(line).append("\n");


        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(destination));

        writer.write(builder.toString());


    }

    public static void main(String[] args) throws IOException {

        copyAFile("C:\\Users\\UsuarioPC\\OneDrive - I.E.S. Federica Montseny\\DAM\\SEGUNDO AÑO\\PROGRAMACIÓN DE SERVICIOS Y PROCESOS\\Buscador\\src\\main\\resources\\el_quijote.txt","C:\\tmp\\el_quijote2.txt");
    }
}
