
package com.mycompany.string_class;


public class String_4 {
    
    
    public static void main(String[] args) {
        
        String hi= "Hello sir, how are you hope you are fine";
        
        String s2= hi.replace('l', 'i');
        System.out.println(s2);
        
        String[] s3= hi.split(" ");
        
        for(String x:s3)
        {
            System.out.println(x);
        }
        
        
        
    }
    
}
