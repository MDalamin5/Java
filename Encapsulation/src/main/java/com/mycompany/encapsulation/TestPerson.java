
package com.mycompany.encapsulation;


public class TestPerson {
    
    public static void main(String[] args) {
       
        Person ob= new Person();
        
        ob.setName("Al Amin");
        System.out.println("The name is: "+ ob.getName());
        
        ob.setAge(24);
        System.out.println("Age is: "+ ob.getAge());
        
    }
    
}
