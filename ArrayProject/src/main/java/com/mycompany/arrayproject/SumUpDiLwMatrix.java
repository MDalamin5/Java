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
public class SumUpDiLwMatrix {
    public static void main(String[] args) {
        int [][] matrix= new int[3][3];
        Scanner input= new Scanner(System.in);
        
        System.out.println("Please Enter your Matrix Elements");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Matrix[%d][%d]: ",i,j);
                matrix[i][j]= input.nextInt();
                
            }
            
        }
        
        System.out.println("Your Entering Matrix IS: ");
        
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print("  "+matrix[i][j]);
                
            }
              System.out.println("\n");
            
        }
          
          
          //sum of diagonal
          
          int sum=0;
          
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  
                  if(i==j)
                  {
                      sum=sum+matrix[i][j];
                  }
                  
              }
            
        }
          
          System.out.println("The sum of Diagonal is: "+sum);
          
          
          //Upper triangle
          int sumUp=0;
          
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  
                  if(j>=i)
                  {
                      sumUp=sumUp+matrix[i][j];
                  }
                  
              }
            
        }
          
          System.out.println("The sum of Upper Trianagle is: "+sumUp);
        
    }
    
}
