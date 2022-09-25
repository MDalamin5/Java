
package com.mycompany.oopintroduction;


public class DemoClassPractice {
    
    public static void main(String[] args) {
        
        DemoClass student= new DemoClass("Al AMin", "01641049756", 24, 5000);
        
        /*
        student.name="Al Amin";
        student.phone= "01641049756";
        student.age= 24;
        student.salary= 5000;
        */
        
        
        student.DisplayDemo();
        
       
       DemoClass stu2 = new DemoClass("kaysar", "014545254", 25,7000);
        
        
       
        stu2.DisplayDemo();
        
        DemoClass stu3 = new DemoClass();
        stu3.DisplayDemo();
        
        
        
    }
    
}
