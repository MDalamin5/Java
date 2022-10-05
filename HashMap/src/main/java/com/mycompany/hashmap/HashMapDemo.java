
package com.mycompany.hashmap;

import java.util.HashMap;


public class HashMapDemo {
    
    public static void main(String[] args) {
        HashMap<Integer, String> coustomar = new HashMap<Integer, String>();
        
        coustomar.put(101, "AL Amin");
        coustomar. put(102,"Kaysar");
        coustomar.put(103, "Tanvir");
        
        System.out.println("101 Id IS: "+ coustomar.get(101));
        System.out.println("103 Id IS: "+ coustomar.get(103));
        System.out.println("102 Id IS: "+ coustomar.get(102));
        
        
        
        
        
        
    }
    
}
