
package com.mycompany.linklist;

import java.util.LinkedList;
public class LinkListDemo {
    
    public static void main(String[] args) {
        
        LinkedList<String> CountryName = new LinkedList<String>();
        
        CountryName.add("Bangladesh");
        CountryName.add("India");
        CountryName.add("Canda");
        
        CountryName.add(2, "Pakistan");
        
        CountryName.addFirst("Austorilia");
        CountryName.addLast("China");
       // CountryName.remove("Canda");
       
       CountryName.remove(2);
        System.out.println("First Elements is: "+CountryName.getFirst());
        System.out.println("Last Elements is: "+CountryName.getLast());
        
       // System.out.println(CountryName);
       
       for(String Country: CountryName)
       {
           System.out.println(Country);
       }
       
        System.out.println("Size of the linkedlist is: "+ CountryName.size());
        
        System.out.println("First Elements is: "+CountryName.getFirst());
        System.out.println("Last Elements is: "+CountryName.getLast());
        
        CountryName.clear();
        
        System.out.println(CountryName);
        
    }
    
}
