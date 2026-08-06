package com.mergeconflict;

public class EmployeeDTO {

    private String employeeId;;      // Unique for every request
    private Long id;
    private String name;
    private String name2;
    private String name1;
    private String department;
    private Double salary;


    public EmployeeDTO() {
    }

    public EmployeeDTO(String employeeId, Long id, String name,
                       String department, Double salary) {
        this.employeeId = employeeId;
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
