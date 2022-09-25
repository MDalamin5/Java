

package com.mycompany.statickeyword;


public class TestStatic {

    public static void main(String[] args) {
        
        Student stu1= new Student("Al Amin", 1811904042);
        stu1.DisplayInformation();
        
        Student stu2 = new Student("Tanvir", 1812545636);
        stu2.DisplayInformation();
        
        
        System.out.println("University name is: "+Student.UniName);
        
        
        
        
    }
}
