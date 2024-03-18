import java.util.Arrays;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double countSumSalary() {
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary = employees[i].getSalary() + totalSalary;
            }
        }
        return totalSalary;
    }

    public static Employee findPersonWithMinSalary() {
        double minSalary = Double.MAX_VALUE;
        int i = 0;
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] != null && minSalary > employees[j].getSalary()) {
                minSalary = employees[j].getSalary();
                i = j;
            }
        }
        return employees[i];
    }

    public static Employee findPersonWithMaxSalary() {
        double minSalary = Double.MIN_VALUE;
        int i = 0;
        for (int j = 0; j < employees.length; j++) {
            if (employees[j] != null && minSalary < employees[j].getSalary()) {
                minSalary = employees[j].getSalary();
                i = j;
            }
        }
        return employees[i];
    }

    public static double countMiddleSalary() {
        int count = 0;
        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count += 1;
                totalSalary = employees[i].getSalary() + totalSalary;
            }
        }
        if (count != 0) {
            double middleSalary = totalSalary / count;
            return middleSalary;
        } else {
            return totalSalary;
        }

    }

    public static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName() + " " + employees[i].getMiddleName() + " " + employees[i].getSurname());
            }
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Надежда", "Васильевна", "Чуркина", 2, 45000);
        employees[1] = new Employee("Екатерина", "Сергеевна", "Невзорова", 2, 55000);
        employees[2] = new Employee("Марина", "Геннадьевна", "Фетисова", 3, 43000);
        employees[3] = new Employee("Ольга", "Владимировна", "Горбунова", 3, 41000);
        employees[4] = new Employee("Александр", "Викторович", "Невзоров", 4, 75000);
        employees[5] = new Employee("Галина", "Михайловна", "Шарикова", 1, 100000);
        employees[6] = new Employee("Надежда", "Борисовна", "Федорова", 1, 90000);
        employees[7] = new Employee("Владимир", "Андреевич", "Симпелев", 4, 95000);
        employees[8] = new Employee("Ольга", "Степановна", "Гаевская", 5, 40000);
        employees[9] = new Employee("Наталья", "Анатольевна", "Сивергина", 5, 48000);

        System.out.println(Arrays.toString(employees));
        double totalSalary = countSumSalary();
        System.out.println("Сумма затрат на ЗП в месяц = " + totalSalary);
        Employee personWithMinSalary = findPersonWithMinSalary();
        System.out.println("Сотрудник с минимальной ЗП - " + personWithMinSalary);
        Employee personWithMaxSalary = findPersonWithMaxSalary();
        System.out.println("Сотрудник с максимальной ЗП - " + personWithMaxSalary);
        double middleSalary = countMiddleSalary();
        System.out.println("Среднее значение зарплат = " + middleSalary);
        printFullName();


    }
}