import java.io.*;

public class ReadFilesExamples {

    public static void main(String[] args) throws IOException {
// ********** CREAR Y ESCRIBIR EN UN DOCUMENTO ********** //
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("write to a file");
            writer.write("\n write another line");
            writer.write("\n write another line");
            writer.write("\n write another line");

            String[] names = {"Michael", "Jhon", "David", "Angel", "Pedro", "Marcos"};
            for (String name : names) {
                writer.write("\n" + name);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null)
            System.out.println(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
