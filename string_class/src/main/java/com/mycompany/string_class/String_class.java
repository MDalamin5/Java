

package com.mycompany.string_class;


public class String_class {

    public static void main(String[] args) {
        
        String FirstName= "Alamin";
        String LastName= " Hossain";
        
        String name= "ALAMIN";
        
        
        String s3 = FirstName.concat(LastName);
         
        System.out.println(s3);
        System.out.println("\n");
        
        //Anothor Methode
       
        
        String s4= FirstName+LastName;
        
        System.out.println(s4);
        
        
       
       int len= s3.length();
       
        System.out.println("The string length is : "+len);
        
        
        boolean b= s3.equals(name);
        
        System.out.println("Both string is Equal: "+b);
        
        boolean c = FirstName.equalsIgnoreCase(name);
        System.out.println("First name and name are equals: "+c);
        
        
       // boolean d= name.contains("AL");
       
       boolean d= name.contains("A");
        System.out.println("Is contanins AL: "+d);
        
        boolean e = name.isEmpty();
        System.out.println(" Name is empty true or false: "+e);
        
        if(name.equalsIgnoreCase(FirstName))
        {
            System.out.println("OKa");
        }
        else
        {
            System.out.println("Not oka");
        }
        
        
       
    }
}
