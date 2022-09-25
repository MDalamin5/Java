

package com.mycompany.teacher;


public class Teacher {
    
    String name, phone, T_id;
    int salary, age;
    

    Teacher(){
        
        System.out.println("No Information Avalible");
    }
    
    Teacher(String s1, String s2)
    {
        
       name= s1;
       phone=s2;
        
    }
    
    Teacher(String s1, String s2, String s3){
        
        name= s1;
       phone=s2;
       T_id=s3;
       
        
    }
    
    Teacher(String s1, String s2, String s3, int s, int a)
    {
        name= s1;
       phone=s2;
       T_id=s3;
       salary=s;
       age= a;
    }
    
    
    void DisplayInformation(){
        
        System.out.println("The name IS: "+name);
        
        System.out.println("Phone Number is: "+phone);
        
        System.out.println("Teacher id is: "+T_id);
        
        System.out.println("Salary is: "+salary);
        
        System.out.println("Teacher age is: "+age);
        
        System.out.println("\n\n");
        
        
        
    }
    
    
    
    
    
    
    
}
