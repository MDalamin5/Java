
package com.mycompany.problems;


public class Variable {
    
    
    void add(int ... num)
    {
        int sum=0;
        
        for(int x:num)
        {
            sum= sum+x;
        }
        
        System.out.println("The sum is: "+sum);
    }
    
}
