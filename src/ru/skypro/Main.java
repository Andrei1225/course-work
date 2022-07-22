package ru.skypro;

public class Main {
    public static void printSeparator() {
        System.out.println("=====================================================================================");
    }

    public static void typeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void countMinSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (minSalary.getEmployeeSalary() > employees[i].getEmployeeSalary()) {
                minSalary = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary);
    }

    public static void countMaxSalary(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (maxSalary.getEmployeeSalary() < employee.getEmployeeSalary()) {
                maxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary);
    }

    public static void sumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getEmployeeSalary();
        }
        System.out.println("Сумма зарплат за месяц: " + sum);
    }

    public static void averageSalary(Employee[] employees) {
        int averageSalary = 0;
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getEmployeeSalary();
        }
        averageSalary = sum / 10;
        System.out.println("Средняя зарплата: " + averageSalary);
    }

    public static void employeesList(Employee[] employees) {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeFullName());
        }
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Харитонов Ибрагил Арсеньевич", 1, 110_000);
        employee[1] = new Employee("Филиппов Артур Николаевич", 2, 120_000);
        employee[2] = new Employee("Некрасов Агафон Валерьянович", 3, 130_000);
        employee[3] = new Employee("Елисеев Варлам Демьянович", 4, 140_000);
        employee[4] = new Employee("Соболев Мстислав Владленович", 5, 150_000);
        employee[5] = new Employee("Волков Вальтер Игнатьевич", 1, 160_000);
        employee[6] = new Employee("Лыткин Осип Валентинович", 2, 170_000);
        employee[7] = new Employee("Лапин Даниил Оскарович", 3, 180_000);
        employee[8] = new Employee("Гурьев Арнольд Юлианович", 4, 190_000);
        employee[9] = new Employee("Якушев Наум Григорьевич", 5, 200_000);

        printSeparator();
        typeAllStaff(employee);
        printSeparator();
        sumSalary(employee);
        printSeparator();
        countMinSalary(employee);
        printSeparator();
        countMaxSalary(employee);
        printSeparator();
        averageSalary(employee);
        printSeparator();
        employeesList(employee);
        printSeparator();
    }

}
