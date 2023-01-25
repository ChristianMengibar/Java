package org.iesfm.spring.readers;

import org.iesfm.spring.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class DepartmentReader {
    private Scanner scanner;

    private static Logger log = LoggerFactory.getLogger(DepartmentReader.class);

    public DepartmentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Department getDepartment() {
        log.info("Introduce el nombre: ");
        String name = scanner.nextLine();
        log.info("Introduce la descripcion: ");
        String description = scanner.nextLine();
        Department department = new Department(name, description);
        return department;
    }
}