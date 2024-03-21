import java.util.Objects;

public class Employee {
    private final String name;
    private final String middleName;
    private final String surname;
    private int department;
    private double salary;
    private final int id;
    private static int counter = 1;

    public Employee(String name, String middleName, String surname, int department, double salary) {
        this.id = counter++;
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.department = department;
        this.salary = salary;

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
        return "id= " + id + ", Сотрудник: " + name + " " + middleName + " " + surname + ", отдел: " + department +
                ", заработная плата = " + salary;
    }
}
