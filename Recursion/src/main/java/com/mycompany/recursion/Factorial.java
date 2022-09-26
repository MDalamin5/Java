
package com.mycompany.recursion;


public class Factorial {
    
   
    int facto=1;
    int fact(int num)
    {
        if (num==1)
            return 1;
        
        else 
            facto=num*fact(num-1);
        return facto; 
        
        
    }
    
    
    
}
