import java.util.Objects;

public class Employee {
    private final String name;
    private final String middleName;
    private final String surname;
    private int department;
    private double salary;
    private int id;
    private static int counter = 1;

    public Employee(String name, String middleName, String surname, int department, double salary) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public static void checkDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new RuntimeException("Поле отдел заполнено не корректно");
        }
    }

    public static void checkSalary(double salary) {
        if (salary < 0) {
            throw new RuntimeException("Поле заработная плата заполнено не корректно");
        }
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public int setDepartment(int department) {
        this.department = department;
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(middleName, employee.middleName) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, middleName, surname, department, salary);
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name + " " + middleName + " " + surname + ", отдел: " + department +
                ", заработная плата = " + salary;
    }
}
