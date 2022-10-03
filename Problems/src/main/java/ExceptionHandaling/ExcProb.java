
package ExceptionHandaling;

import java.util.Scanner;


public class ExcProb {
    public static void main(String[] args) {
        
    while(true)
    {
            try{
            int num1,num2,result;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter num1: ");
        
        num1= input.nextInt();
        
        System.out.print("Please enter num2: ");
        
        num2= input.nextInt();
        
        System.out.printf("Result: %d/%d = %d\n",num1,num2,num1/num2);
        
        }
        
        catch(Exception e){
            System.out.println(""+e);
            System.out.println("You must enter integer. Plseae Try again");
            
            
            
            
        }
    }
                
                
                
                
    }
    
}
