package Company;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;
import java.net.URISyntaxException;
import java.util.List;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        try {
            File file = new File(Company.class.getResource("/Company.json").toURI());
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder builder = new StringBuilder();

            String line;

            while ((line = reader.readLine()) != null) {

                builder.append(line + "\n");

            }
            reader.close();

            String fileContent = builder.toString();

            ObjectMapper mapper = new ObjectMapper();

            Company company = mapper.readValue(fileContent, Company.class);

            log.info(company.toString());

            log.info(company.getDepartments().get(0).getEmployees().toString());

            File file1 = new File("employees.json");

            mapper.writeValue(file1, company.getDepartment("Programing"));


        } catch (URISyntaxException e) {
            log.error("" + e);
        } catch (FileNotFoundException e) {
            log.error("" + e);
        } catch (IOException e) {
            log.error("" + e);
        }

    }


}
