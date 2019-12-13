package Assigments2;

public class Practice2 {
    public static void main(String[] args) {
        Employee obj = new Employee();

        obj.getDetails();
    }
}


class Employee {
    String employee_name;
    String employee_position;
    int employee_hours;
    double employee_salary;

    public String setDetails(String name, String position, int hours, double salary) {
        this.employee_name = name;
        this.employee_position = position;
        this.employee_hours = hours;
        this.employee_salary = salary;

        return name + "\n" + position + "\n" + hours + "\n" + salary;
    }

    public void getDetails() {
        String a = setDetails("Jose", "IT", 8, 25.7);

        System.out.println(a);
    }
}