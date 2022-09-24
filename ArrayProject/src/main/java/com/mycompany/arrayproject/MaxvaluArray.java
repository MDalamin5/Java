/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayproject;

import java.util.Scanner;

/**
 *
 * @author mdalamin
 */
public class MaxvaluArray {
    public static void main(String[] args) {
        
        int[] num= new int[5];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < 5; i++) {
            
            num[i]= input.nextInt();
            
        }
        
        int max= num[0];
        
        for (int i = 1; i < 5; i++) {
            
            if(num[i]>max){
                max=num[i];
            }
            
        }
        
        System.out.println("The max number is: "+max);
        
    }
    
}
