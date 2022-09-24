
package com.mycompany.string_class;


public class PalenDrom {
    
    public static void main(String[] args) {
        
      String  s1= "madam";
      
       StringBuilder str = new StringBuilder("maqqdam");
       
       String s2= str.reverse().toString();
       
        System.out.println(s2);
        
        if(s1.equals(s2))
        {
            System.out.println("Palendrom");
        }
        
        else
        {
            System.out.println("Not palendrom");
        }
        
        str.append(" Hello");
        System.out.println(str);
       
        
        
    }
    
}
