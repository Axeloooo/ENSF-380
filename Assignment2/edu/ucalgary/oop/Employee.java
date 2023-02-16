package edu.ucalgary.oop;

public class Employee {
    private String name;
    private String idNumber;
    private String managerId;
    private Employee[] supervisedEmployees;
    public Employee(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }
    public Employee(String name, String idNumber, String managerId) {
        this.name = name;
        this.idNumber = idNumber;
        this.managerId = managerId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIDNumber() {
        return this.idNumber;
    }
    public String getManagerId() {
        return this.managerId;
    }
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
    public void addEmployee(Employee newEmployee) {
        if (this.supervisedEmployees == null) {
            this.supervisedEmployees = new Employee[1];
            this.supervisedEmployees[0] = newEmployee;
        } else {
            Employee[] temp = new Employee[this.supervisedEmployees.length + 1];
            for (int i = 0; i < this.supervisedEmployees.length; i++) {
                temp[i] = this.supervisedEmployees[i];
            }
            temp[this.supervisedEmployees.length] = newEmployee;
            this.supervisedEmployees = temp;
        }
    }
    public Employee[] getEmployees() {
        return this.supervisedEmployees;
    }
}
