package ru.skypro;

public class Employee {
    private String employeeFullName;
    private int departmentNumber;
    private int employeeSalary;
    public int id;
    private static int counter = 1;

    public Employee(String employeeFullName, int departmentNumber, int employeeSalary) {
        this.employeeFullName = employeeFullName;
        this.departmentNumber = departmentNumber;
        this.employeeSalary = employeeSalary;
        this.id = getCounter();
        counter++;
    }
    public static int getCounter() {
        return counter;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    @Override
    public String toString() {
        return "Ф.И.О сотрудника: " + employeeFullName +", "+
                "номер отдела: " + departmentNumber +
                ", зарплата сотрудника: " + employeeSalary +
                ", идентификационный номер: " + id;
    }




}

