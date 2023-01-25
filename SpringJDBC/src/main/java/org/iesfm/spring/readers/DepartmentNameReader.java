package org.iesfm.spring.readers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class DepartmentNameReader {
    private Scanner scanner;

    private static Logger log = LoggerFactory.getLogger(DepartmentReader.class);

    public DepartmentNameReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getDepartment() {
        log.info("Introduce el nombre: ");
        String name = scanner.nextLine();
        return name;
    }
}