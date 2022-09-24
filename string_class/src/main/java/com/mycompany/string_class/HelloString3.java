
package com.mycompany.string_class;


public class HelloString3 {
    
    
    public static void main(String[] args) {
        
        String haa= "Hello sir! how are you";
        
        //print any string charecter 
        
        System.out.println(haa.charAt(0));
        
        int result= haa.codePointAt(5);
        
        System.out.println(" index 5 char. aslice value is: "+result);
        
        int index= haa.indexOf('a');
        
        System.out.println("THe index of a is: "+index);
        
        System.out.println(" Last Index of o is: "+haa.lastIndexOf('o'));
        
        String s3= haa.trim();
        
        System.out.println(s3);
        
        
    }
    
}
