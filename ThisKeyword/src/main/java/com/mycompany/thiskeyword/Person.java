
package com.mycompany.thiskeyword;


public class Person {
    
    String name;
    int age;
    String h_c;
    
    
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    
    Person(String name, int age, String h_c)
    {
        this(name,age);
        this.h_c=h_c;
    }
    
    
    void diplay()
    {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("HairColor is: "+h_c);
        System.out.println("\n");
    }
    
}
