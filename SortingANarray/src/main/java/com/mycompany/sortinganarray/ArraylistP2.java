
package com.mycompany.sortinganarray;

import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistP2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> num= new ArrayList<>();
        
        num.add(5);
        num.add(45);
        num.add(2, 6);
        num.add(8);
        
        System.out.print(num);
        
        Iterator itr= num.iterator();
        
        System.out.println("");
        
        while(itr.hasNext())
        {
            System.out.print(" "+itr.next());
        }
        
       //num.clear();
       // System.out.println(num);
        
        System.out.println("");
        
       boolean check= num.isEmpty();
       
        System.out.print("array list is empty:  "+check);
        
       boolean cont= num.contains(45);
       
        System.out.println("This elements in the list: "+cont);
        
        num.set(3, 555);
        
        System.out.println( num);
        
        int x = num.get(3);
        System.out.println(x);
        
        int pos = num.indexOf(555);
        
        System.out.println(pos);
        
        
        
        
    }
    
}
