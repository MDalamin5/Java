
package com.mycompany.statickeyword;


public class Student {
    
    String name;
    int id;
   static String UniName= "NSU";
    
   
   Student(String nm, int i)
   {
       name=nm;
       id=i;
   }
   
   void DisplayInformation(){
       
       System.out.println("Name: "+name);
       
       System.out.println("Id: "+id);
       
       System.out.println("University Name: "+UniName);
       
       System.out.println("\n\n");
   }
    
}
