package org.iesfm.spring;

import org.iesfm.spring.dao.DepartmentDAO;
import org.iesfm.spring.dao.EmployeeDAO;
import org.iesfm.spring.readers.DepartmentNameReader;
import org.iesfm.spring.readers.DepartmentReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private EmployeeDAO employeeDAO;
    private DepartmentDAO departmentDAO;
    private DepartmentReader departmentReader;
    private DepartmentNameReader departmentNameReader;

    private static Logger log = LoggerFactory.getLogger(Menu.class);

    public Menu(Scanner scanner, EmployeeDAO employeeDAO, DepartmentDAO departmentDAO, DepartmentReader departmentReader, DepartmentNameReader departmentNameReader) {
        this.scanner = scanner;
        this.employeeDAO = employeeDAO;
        this.departmentDAO = departmentDAO;
        this.departmentReader = departmentReader;
        this.departmentNameReader = departmentNameReader;
    }

    public void menu() {
        List<Department> departments;
        List<Employee> employees;
        int enterOption = 0;
        while (enterOption != 4) {
            log.info("**************************MENU**************************");
            log.info("  1. Muestra los departamentos.");
            log.info("  2. Muestra los empleados dado un departamento.");
            log.info("  3. Inserta un departamento.");
            log.info("  4. Salir.");
            log.info("**************************MENU**************************");
            log.info("Introduce la opcion que desees: ");
            enterOption = scanner.nextInt();
            scanner.nextLine();
            if (enterOption == 1) {
                departments = departmentDAO.list();
                for (Department department : departments) {
                    log.info(department.toString());
                }
            } else if (enterOption == 2) {
                employees = employeeDAO.getEmployees(departmentNameReader.getDepartment());
                for (Employee employee : employees) {
                    log.info(employee.toString());
                }
            } else if (enterOption == 3) {
                departmentDAO.insert(departmentReader.getDepartment());
            } else if (enterOption == 4) {
                log.info("Has salido satisfactoriamente.");
            }
        }
    }
}