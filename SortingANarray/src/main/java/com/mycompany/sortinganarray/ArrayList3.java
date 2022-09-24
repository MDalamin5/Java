
package com.mycompany.sortinganarray;

import java.util.ArrayList;


public class ArrayList3 {
    
    public static void main(String[] args) {
        
            ArrayList num= new ArrayList<>();
            ArrayList num2= new ArrayList<>();
            ArrayList num3= new ArrayList<>();
        
            num.add(54);
            num.add(44);
            num.add(444);
            num.add(784);
            num.add(564);
            num.add(874);
            
            num2.add(5);
            num2.add(4);
            num2.add(4);
            num2.add(7);
            num2.add(5);
            num2.add(8);
            
            num3.addAll(num);
            System.out.println(num3);
            
            boolean result = num.equals(2);
            
            System.out.println(""+result);
            
            
            
            
        
        
        
    }
    
}
