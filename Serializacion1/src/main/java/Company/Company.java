package Company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {
    private String name;
    private List<Department> departments;

    @JsonCreator
    public Company(
            @JsonProperty("name") String name,
            @JsonProperty("departments") List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }
    public Company() {


    }

    public  List<Employee> getDepartment(String deptartmentName){

        List<Employee> employeeList = new ArrayList<>();
        for (Department department : departments) {
            if (department.getDepartmentName().equals(deptartmentName)){

                 employeeList = department.getEmployees();

            }

        }
        return employeeList;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departments);
    }

    @Override
    public String toString() {
        return "Company.Company{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
