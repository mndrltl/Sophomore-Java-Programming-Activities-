package main;

public class act1
{
       public static void main(String[] args) 
    
    {   
        //#1 Person: Creating 2 Persons objects

        Person p1 = new Person ("Jamin Villareal", 20);
        Person p2 = new Person ("Ashley Gabrielle Alcantara", 19);

        System.out.println("\n#1. Class: Person\n");

        //Showing details
        
        p1.displayInfo();
        p2.displayInfo();
        System.out.println("\n");

        //Setting the new age after 6 years
        System.out.println("Their age after 6 years: \n");
        p1.name = "Jamin Villareal";
        p1.age = 26;
        p2.name = "Ashley Gabrielle Alcantara";
        p2.age = 25;

        //Displaying the new age after 6 years

        p1.displayInfo();
        p2.displayInfo();
        System.out.println("\n");

        //#2 Rectangle: Calculating the area and perimeter of the rectangle

        Rectangle r1 = new Rectangle (12,7);


        System.out.println("#2. Class: Rectangle\n");

        //Showing details

        System.out.println("The area of the rectangle is: " + r1.getArea());
        System.out.println("The perimeter of the rectangle is: " + r1.getPerimeter());
        System.out.println("\n");

        r1.width = 9;
        r1.height = 8;

        System.out.println("Changing width and height (9,8)");
        System.out.println("\nThe area of the rectangle is now: " + r1.getArea());
        System.out.println("The perimeter of the rectangle is now: " + r1.getPerimeter());
        System.out.println("\n");
        

        //#3 Employee: Calculating and updating the salary of the employees.

        Employee e1 = new Employee("Jamin Villareal", "Cybersecurity", 100000);
        Employee e2 = new Employee("Ashley Alcantara", "Graphic Designer", 120000);

        System.out.println("#3. Class: Employee\n");

        //Showing Details

        System.out.println("Employee Details: \n");
        e1.displayEmployee();
        System.out.println("\n");
        e2.displayEmployee();
        System.out.println("\n");

        System.out.println("After raising the salary of the employees: \n");
        System.out.println("10% for " + e1.name + ":");
        e1.raiseSalary(10);
        e1.displayEmployee();
        System.out.println("\n");

        System.out.println("12% for " + e2.name + ":");
        e2.raiseSalary(12);
        e2.displayEmployee();
        System.out.println("\n");

    }

 // Activity #1.1: Number 1, Person class
     static class Person 
{

    String name;
    int age;

    //Constructor
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //Method
    void displayInfo() 
    {
        System.out.println(name + " is " + age + " years old.");
    }
 
}

// Activity #1.2: Number 2, Rectangle class
    static class Rectangle 
{
    double width, height;

    //Constructor
    Rectangle(double width, double height)
    { 
        this.width = width;
        this.height = height;
    }

    //Method
    double getArea() 
    {
        return width * height;
    }
    double getPerimeter () 
    {
       return 2 * (width + height);
    }

}

// Activity #1.3: Number 3, Employee

    static class Employee 
{
    String name, jobTitle;
    double salary;


    //Constructor
    Employee (String name, String jobTitle, double salary)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //Method to raise salary by percentage
    void raiseSalary (double percent) 
    {
        salary += salary * (percent/100);
    }

    //Method to display the details
    void displayEmployee () 
    {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}


}

