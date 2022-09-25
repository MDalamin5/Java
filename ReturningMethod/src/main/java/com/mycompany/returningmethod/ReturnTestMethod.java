
package com.mycompany.returningmethod;

import java.util.Scanner;

public class ReturnTestMethod {
    
    public static void main(String[] args) {
        ReturningMethod value= new ReturningMethod();
        
        Scanner input= new Scanner(System.in);
        
        int num;
        
        System.out.print("Please Enter a value: ");
        num=input.nextInt();
        
       int result= value.Squer(num);
       
        System.out.printf("The squre of the %d is= %d",num,result);
    }
    
    
    
    
}
