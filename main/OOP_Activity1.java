package main;

public class OOP_Activity1.1 {

    // Activity 1: Person class
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayInfo() {
            System.out.println(name + " is " + age + " years old.");
        }
    }

    // Activity 2: Rectangle class
    static class Rectangle {
        double width, height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double getArea() {
            return width * height;
        }

        double getPerimeter() {
            return 2 * (width + height);
        }
    }

    // Activity 3: Employee class
    static class Employee {
        String name;
        String jobTitle;
        double salary;

        Employee(String name, String jobTitle, double salary) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        void raiseSalary(double percent) {
            salary += salary * (percent / 100);
        }

        void displayEmployee() {
            System.out.println("Name: " + name);
            System.out.println("Job Title: " + jobTitle);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        // ---------- ACTIVITY 1 ----------
        System.out.println("=== Activity 1: Person ===");
        Person p1 = new Person("Claude Xiana", 3);
        Person p2 = new Person("Chris Xian", 9);
        p1.displayInfo();
        p2.displayInfo();

        System.out.println("\nSet new age and name:");
        p1.name = "Claude Xiana";
        p1.age = 9;
        p2.name = "Chris Xian";
        p2.age = 15;
        p1.displayInfo();
        p2.displayInfo();

        // ---------- ACTIVITY 2 ----------
        System.out.println("\n=== Activity 2: Rectangle ===");
        Rectangle r1 = new Rectangle(12, 7);
        System.out.println("The area of the rectangle is " + r1.getArea());
        System.out.println("The perimeter of the rectangle is " + r1.getPerimeter());

        r1.width = 9;
        r1.height = 8;
        System.out.println("\nThe area of the rectangle is now " + r1.getArea());
        System.out.println("The perimeter of the rectangle is now " + r1.getPerimeter());

        // ---------- ACTIVITY 3 ----------
        System.out.println("\n=== Activity 3: Employee ===");
        Employee e1 = new Employee("Juan Dela Cruz", "HR Manager", 40000);
        Employee e2 = new Employee("Andreas Hobard", "Software Engineer", 60000);

        System.out.println("Employee Details:");
        e1.displayEmployee();
        e2.displayEmployee();

        System.out.println("\nAfter raising salary:");
        System.out.println("\n8% for '" + e1.name + "':");
        e1.raiseSalary(8);
        e1.displayEmployee();

        System.out.println("\n12% for '" + e2.name + "':");
        e2.raiseSalary(12);
        e2.displayEmployee();
    }
}
