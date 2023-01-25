package org.iesfm.spring.dao;

import org.iesfm.spring.Employee;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDAO {
    private final static String SELECT_EMPLOYEES = "SELECT * FROM Employee";

    private final static String SELECT_DEPARTMENT_EMPLOYEES = "SELECT * FROM Employee WHERE department_name = :department_name";

    private final static String INSERT_EMPLOYEE = "INSERT INTO Employee(" +
            " nif, " +
            " name, " +
            " surname, " +
            " role, " +
            " department_name" +
            ") " +
            "VALUES(" +
            " :nif," +
            " :name," +
            " :surname," +
            " :role," +
            " :department_name" +
            ")";

    private NamedParameterJdbcTemplate jdbc;

    public EmployeeDAO(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void insert(Employee employee) {
        Map<String, Object> params = new HashMap<>();
        params.put("nif", employee.getNif());
        params.put("name", employee.getName());
        params.put("surname", employee.getSurname());
        params.put("role", employee.getRole());
        params.put("department_name", employee.getDepartment_name());
        jdbc.update(INSERT_EMPLOYEE, params);
    }

    public List<Employee> list() {
        Map<String, Object> params = new HashMap<>();
        return jdbc.query(
                SELECT_EMPLOYEES,
                params,
                (rs, rownum) ->
                        new Employee(
                                rs.getString("nif"),
                                rs.getString("name"),
                                rs.getString("surname"),
                                rs.getString("role"),
                                rs.getString("department_name")
                        )
        );
    }

    public List<Employee> getEmployees(String department) {
        Map<String, Object> params = new HashMap<>();
        params.put("department_name", department);
        return jdbc.query(
                SELECT_DEPARTMENT_EMPLOYEES,
                params,
                (rs, rownum) ->
                        new Employee(
                                rs.getString("nif"),
                                rs.getString("name"),
                                rs.getString("surname"),
                                rs.getString("role"),
                                rs.getString("department_name")
                        )
        );
    }
}