/**
 * Java 1. Lesson 5
 * 
 * @author Ruslan Sharifullin
 * @version 17.11.2021
 */

class Lesson5 {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alexey Smirnov", "Manager", "alexey@mail.ru", 5171010, 30000, 30),
            new Employee("Dmitriy Obuhov", "Designer", "dmitriy@mail.ru", 5172020, 40000, 35),
            new Employee("Stepan Kuzmenko", "Model", "stepan@mail.ru", 5173030, 50000, 40),
            new Employee("Oleg Tkachev", "Producer", "oleg@mail.ru", 5174040, 60000, 45),
            new Employee("Sergey Trubin", "Writer", "sergey@mail.ru", 5175050, 70000, 50)
        };

        for (Employee employee : employees)
            if (employee.getAge() > 40)
                System.out.println(employee.toString());
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public int salary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age);
    }
}