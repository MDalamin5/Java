
package com.mycompany.teacher;


public class TestClass {
    
    public static void main(String[] args) {
        
        Teacher tcr = new Teacher();
        tcr.DisplayInformation();
        
        Teacher tcr1 = new Teacher("Md Al Amin", "01641049756", "1811904");
        tcr1.DisplayInformation();
        
        
        Teacher tcr2= new Teacher("Kaysar", "0175865453", "181112422", 158000, 25);
        
        tcr2.DisplayInformation();
        
        
        Teacher tcr3  = new Teacher("Tanvir", "0155583656", "181255865");
        
        tcr3.DisplayInformation();
        
        
        
    }
    
}
