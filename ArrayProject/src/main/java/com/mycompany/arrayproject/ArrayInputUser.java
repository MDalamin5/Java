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
public class ArrayInputUser {
    
    public static void main(String[] args) {
        
        double [] num = new double [5];
        double sum=0;
        
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter 5 integer: ");
        
        for (int i = 0; i < 5; i++) {
            
            num[i]=input.nextInt();
            
        }
        
        for (int i = 0; i < num.length; i++) {
            
            sum= sum+ num[i];
            
        }
        
        System.out.printf("the sum of this is = %.1f",sum);
        
    }
    
}
