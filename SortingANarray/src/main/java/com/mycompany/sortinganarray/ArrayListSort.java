
package com.mycompany.sortinganarray;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListSort {
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(5);
        num.add(-3);
        num.add(7);
        num.add(8);
        num.add(-7);
        num.add(5);
        
        System.out.println("Before Sorting");
        
        System.out.println(num);
        
        Collections.sort(num);
        
        System.out.println("After Sorting");
        
        System.out.println(num);
        
        System.out.println("Reveres order");
        
        Collections.sort(num,Collections.reverseOrder());
        System.out.println("After revers "+num);
        
        
        
        
        
        
    }
    
}
