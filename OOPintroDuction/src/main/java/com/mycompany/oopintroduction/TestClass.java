
package com.mycompany.oopintroduction;


public class TestClass {
    
    public static void main(String[] args) {
        
        Teacher teacher1; //initiligation
        teacher1 = new Teacher(); //dicleartation
        
        /*
        teacher1.name= "Al Amin";
        teacher1.gender= "Male";
        teacher1.phone_num= "01641049756";
        teacher1.age= 24;
        */
        
        teacher1.setinfo("Al AMin", "Male", "01641049478", 44);
        
        teacher1.DisplayInfo();
        
        Teacher teacher2= new Teacher();
        
       /* 
        teacher2.name= "Shihab";
        teacher2.gender= "Male";
        teacher2.phone_num= "05541049756";
        teacher2.age= 25;
        */
        //teacher2.DisplayInfo();
         
    }
    
}
