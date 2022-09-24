
package com.mycompany.oopintroduction;


public class Teacher {
    
    String name, gender,phone_num;
    int age;
    
    void setinfo(String s1, String s2, String s3, int n)
    {
        
        
        name=s1;
        gender= s2;
        phone_num= s3;
        age= n;
        
        
        
    }
    
    
    void DisplayInfo(){
    
        System.out.println("The name of theacher: "+name);
        System.out.println("Gander: "+gender);
        System.out.println("Phone Number: "+phone_num);
        System.out.println("Age: "+age);
    
        System.out.println("\n");
    
}
    
    
    
    
}
