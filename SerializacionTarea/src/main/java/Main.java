import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.net.URISyntaxException;

public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);
    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        try {
            //Esta linea va a ser siempre asi.
            File file = new File(Shop.class.getResource("/tienda.json").toURI());

            //Mappear el archivo, vinculamos el JSON con las clases que hemos creado para hacer consultas.
            Shop shop = mapper.readValue(file, Shop.class);

            //Cantidad de pedidos que hay.
            log.info("El numero de pedido es: " + shop.getOrders().size());

            //Consulta para conseguir el nombre.
            log.info("El numero de pedido es: " + shop.getName());

        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}