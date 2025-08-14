package main;

public class act1Persons 
{
       public static void main(String[] args) 
    
    {   
        //#1 Person: Creating 2 Persons objects

        Person p1 = new Person ("Jamin Villareal", 20);
        Person p2 = new Person ("Ashley Gabrielle Alcantara", 19);

        //Showing details
        System.out.println("The names and ages are: \n");
        p1.displayInfo();
        p2.displayInfo();
        System.out.println("\n");


    }

 // Activity #1: Number 1, Person class
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
}

