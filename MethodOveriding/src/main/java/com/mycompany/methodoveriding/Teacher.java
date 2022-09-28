
package com.mycompany.methodoveriding;


public class Teacher extends Person {
    
    String quleification;
    
    @Override
             
     void DisInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qulaficatrion: "+quleification);
    }
    
    
}
