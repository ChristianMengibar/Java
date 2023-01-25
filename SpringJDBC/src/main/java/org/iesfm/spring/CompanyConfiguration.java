package org.iesfm.spring;

import org.iesfm.spring.dao.DepartmentDAO;
import org.iesfm.spring.dao.EmployeeDAO;
import org.iesfm.spring.readers.DepartmentNameReader;
import org.iesfm.spring.readers.DepartmentReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Scanner;

@Configuration
@PropertySource("application.properties")
public class CompanyConfiguration {
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public DepartmentNameReader departmentNameReader(Scanner scanner) {
        return new DepartmentNameReader(scanner);
    }

    @Bean
    public DepartmentReader departmentReader(Scanner scanner) {
        return new DepartmentReader(scanner);
    }

    @Bean
    public Menu menu(Scanner scanner, EmployeeDAO employeeDAO, DepartmentDAO departmentDAO, DepartmentReader departmentReader, DepartmentNameReader departmentNameReader){
        return new Menu(scanner, employeeDAO, departmentDAO, departmentReader, departmentNameReader);
    }

    @Bean
    public EmployeeDAO employeeDAO(NamedParameterJdbcTemplate jdbc) {
        return new EmployeeDAO(jdbc);
    }

    @Bean
    public DepartmentDAO departmentDAO(NamedParameterJdbcTemplate jdbc) {
        return new DepartmentDAO(jdbc);
    }

    @Bean
    public NamedParameterJdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    public DataSource dataSource(
            // placeholder
            @Value("${database.driver}") String driver,
            @Value("${database.url}") String url,
            @Value("${database.user}") String user,
            @Value("${database.password}") String password
    ) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }
}