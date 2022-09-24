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
public class Array2Darry {
    
    public static void main(String[] args) {
        
        int [][] num= new int[2][3];
        int [][] num2= new int[2][3];
        Scanner input= new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.printf("Plese enter Elements Index[%d][%d]=",i,j);
                num[i][j]= input.nextInt();
                
            }
            
        }
        
        System.out.println("Enter Another Matrix value");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.printf("Plese enter Elements Index[%d][%d]=",i,j);
                num2[i][j]= input.nextInt();
                
            }
            
        }
        
        
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print (" "+num[i][j]);
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print (" "+num2[i][j]);
                
            }
            
            System.out.println("");
            
        }
        
        
        //add two matrix
        System.out.println("\n");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print(" "+(num[i][j]+num2[i][j]));
                
            }
            System.out.println("");
            
        }
        
    }
    
    
}
