

package com.mycompany.typercasting;


public class Typercasting {

    public static void main(String[] args) {
        
        Person p = new Person(){
          
            void dis(){
                System.out.println("Its Anonymous Class");
            }
            
        };
        
        p.dis();
        
        
    }
}
 