
package com.mycompany.oopintroduction;


public class DemoClassPractice {
    
    public static void main(String[] args) {
        
        DemoClass student= new DemoClass();
        
        /*
        student.name="Al Amin";
        student.phone= "01641049756";
        student.age= 24;
        student.salary= 5000;
        */
        student.SetObject("Al AMin", "01641049756", 24, 5000);
        
        student.DisplayDemo();
        
        
        DemoClass stu2 = new DemoClass();
        
        stu2.name= "Kaysar";
        stu2.phone= "0178654555";
        stu2.age= 25;
        stu2.salary= 7000;
        
        stu2.DisplayDemo();
        
        
        
    }
    
}
