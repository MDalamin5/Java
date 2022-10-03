
package com.mycompany.exceptionhandeling;


public class ExpDemo {
    public static void main(String[] args) {
        
        try{
            int x=5;
        int  y = 0;
        
        int result = x/y;
        
        System.out.println(""+result);
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println(""+a);
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
        
        
        finally{
            System.out.println("Last Line fo Programming");
        }
       
    }
    
}
