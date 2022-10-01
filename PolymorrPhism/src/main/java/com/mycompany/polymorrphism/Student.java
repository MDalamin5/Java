
package com.mycompany.polymorrphism;


public class Student extends Person {
    
    String pain="Pain Pro Max";
    
    @Override
    void display()       
    {
        super.display();
        System.out.println("Pain Is: "+pain);
    }
    
    
}
