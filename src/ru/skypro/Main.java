package ru.skypro;

public class Main {
    public static void printSeparator() {
        System.out.println("=====================================================================================");
    }

    public static void printAllStaff(Employee[] employees) {
        if (employees == null) {
            System.out.println("Массив пустой");
        } else {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void printMinSalary(Employee[] employees) {
        if (employees == null) {
            System.out.println("Массив пустой");
        } else {
            Employee empWithMinSalary = employees[0];
            for (int i = 0; i < employees.length; i++) {
                if (empWithMinSalary.getEmployeeSalary() > employees[i].getEmployeeSalary()) {
                    empWithMinSalary = employees[i];
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + empWithMinSalary);
        }
    }

    public static void printMaxSalary(Employee[] employees) {
        if (employees == null) {
            System.out.println("Массив пустой");
        } else {
            Employee empWithMaxSalary = employees[0];
            for (int i = 0; i < employees.length; i++) {
                if (empWithMaxSalary.getEmployeeSalary() <= employees[i].getEmployeeSalary()) {
                    empWithMaxSalary = employees[i];
                }
            }
            System.out.println("Сотрудник с максимальной зарплатой: " + empWithMaxSalary);
        }
    }

    public static void printSumSalary(Employee[] employees) {
        if (employees == null) {
            System.out.println("Массив пустой");
        } else {
            int sum = 0;
            for (int i = 0; i < employees.length; i++) {
                sum += employees[i].getEmployeeSalary();
            }
            System.out.println("Сумма зарплат за месяц: " + sum);
        }
    }

    public static void printAverageSalary(Employee[] employees) {
        if (employees == null) {
            System.out.println("Массив пустой");
        } else {
            int averageSalary = 0;
            int sum = 0;
            for (int i = 0; i < employees.length; i++) {
                sum += employees[i].getEmployeeSalary();
            }
            averageSalary = sum / employees.length;
            System.out.println("Средняя зарплата: " + averageSalary);
        }
    }

    public static void printEmployeesFullNameList(Employee[] employees) {
        if (employees == null) {
            System.out.println("Массив пустой");
        } else {
            System.out.println("Список сотрудников: ");
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getEmployeeFullName());
            }
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
        printAllStaff(employee);
        printSeparator();
        printSumSalary(employee);
        printSeparator();
        printMinSalary(employee);
        printSeparator();
        printMaxSalary(employee);
        printSeparator();
        printAverageSalary(employee);
        printSeparator();
        printEmployeesFullNameList(employee);
        printSeparator();
    }
}
