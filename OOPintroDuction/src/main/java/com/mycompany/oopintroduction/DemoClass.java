
package com.mycompany.oopintroduction;


public class DemoClass {
    
    String name, phone;
    int age, salary;
    
    DemoClass(String s1, String s2, int m, int n){
        
        name= s1;
        phone= s2;
        age= m;
        salary= n;
        
        
    }
    
    DemoClass()
    {
        
        System.out.println("No velue");
        
        
        
    }
    
    void DisplayDemo(){
        
        System.out.println("The name of the sutdent: "+name);
        
        System.out.println("PhoneNumber is: "+phone);
        
        System.out.println("Age is: "+age);
        
        System.out.println("Salary is: "+salary);
        
        System.out.println("\n\n");
        
    }
}
