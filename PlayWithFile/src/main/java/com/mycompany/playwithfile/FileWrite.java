
package com.mycompany.playwithfile;

import java.util.Formatter;
import java.util.Scanner;


public class FileWrite {
    public static void main(String[] args) {
        String id, name;
        int num;
        
        
        
       try
       {
            Formatter ob = new Formatter("/Users/mdalamin/NetBeansProjects/PlayWithFile/Person/teacher.txt");
            
            Scanner input = new Scanner(System.in);
            System.out.print("HOw many student you want to add: ");
            num= input.nextInt();
            
            for (int i = 1; i <= num; i++) {
                System.out.print("Please Enter student id And Name: ");
                id= input.next();
                name= input.next();
                
                ob.format("%s %s \r\n", id,name);
               
           }
            
            
            
            
            
            
            
            ob.close();
            
            
            
            
            
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
        
        
    }
}
