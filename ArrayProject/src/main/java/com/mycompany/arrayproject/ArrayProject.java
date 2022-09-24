/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrayproject;

/**
 *
 * @author mdalamin
 */
public class ArrayProject {

    public static void main(String[] args) {
        
        int[] number= new int[5];
        
        number[0]=1;
        number[1]=6;
        number[2]=13;
        number[3]=12;
        number[4]=15;
        
        int result= number[0]+number[1];
        
        System.out.println(""+result);
        
        int len = number.length;
        System.out.println(""+len);
        
        
    }
}
