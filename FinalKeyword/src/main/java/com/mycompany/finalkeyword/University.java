
package com.mycompany.finalkeyword;


public class University {
    
    final String name;
   final int fees;
   static final int sal;
   
   static{
       sal= 250000;
   }
    
    University()
    {
        name="NSUU";
        fees=25000000;
    }
    
    
    void dis()
    {
        System.out.println(" Name of the university : "+name);
        System.out.println("Semister fees: "+fees);
        System.out.println("Salary is : "+sal);
    }
    
}
