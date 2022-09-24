/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortinganarray;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mdalamin
 */
public class ArrayListDemo {
    
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>();
        //System.out.println(" "+num.size());
        
        num.add(0);
        num.add(23);
        num.add(44);
        num.add(67);
        num.add(4, 5);
        
        //System.out.println(num);
        /*
        for(int x: num){
            System.out.print(" "+x);
        }
        System.out.println("");
        
        
        */
        
        Iterator itr=num.iterator();
        
        while(itr.hasNext())
        {
            System.out.print(" "+itr.next());
        }
        
        System.out.println("");
        
        //Removing array
        
        num.remove(2);
        System.out.print(num);
        
        System.out.println("");
        
        num.removeAll(num);
        System.out.print(num);
        
        
        
        //System.out.println(""+num.size());
        
    }
    
}
