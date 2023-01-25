package org.iesfm.serializacion;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            File file = new File(Shop.class.getResource("/tienda.json").toURI());
            ObjectMapper objectMapper = new ObjectMapper();
            Shop shop = objectMapper.readValue(file,Shop.class);
            log.info("EL numero de pedidos es: " + shop.getOrders().size());
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