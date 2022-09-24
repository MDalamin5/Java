/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sortinganarray;

import java.util.Arrays;

/**
 *
 * @author mdalamin
 */
public class SortingANarray {

    public static void main(String[] args) {
        int [] num= {2,3,4,34,1};
        
        Arrays.sort(num);
        
        for (int i = 0; i < num.length; i++) {
            
            System.out.print(" "+num[i]);
            
        }
        System.out.println("");
        
        //desending
        
        for (int i = num.length-1 ; i>=0; i--) {
            System.out.print(" "+num[i]);
            
        }
        
        String[] name={"Alamin", "kaysar", "book", "cook", "hukk"};
        
        Arrays.sort(name);
        System.out.println("");
        
        for (int i = 0; i < name.length; i++) {
            
            System.out.println(" "+name[i]);
            
        }
        
        
        
        
    }
}
