
package com.mycompany.statickeyword;


public class StaticMethod {
    
   static int x=10;
    
   void Display(){
        System.out.println("I'm non sttatic method");
        System.out.println(""+x);
        Display2();
        System.out.println("");
    }
    
   static void Display2(){
    
            System.out.println("I'm Static Method");
            System.out.println("Hello !");
            System.out.println(""+x);
            
            
}
    
}
