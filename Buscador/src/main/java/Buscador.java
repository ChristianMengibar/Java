import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buscador {
    private static Logger log = LoggerFactory.getLogger(BufferedReaderExample.class);

    public static int Busqueda(String text) throws IOException {
        int cont = 0;
        BufferedReader reader =
                new BufferedReader(
                        new FileReader("src/main/resources/el_quijote.txt"));
        String line = reader.readLine();

        while (line != null) {
            if (line.contains(text)) {
                cont++;
            }
            line = reader.readLine();
        }
        return cont;
    }

}



