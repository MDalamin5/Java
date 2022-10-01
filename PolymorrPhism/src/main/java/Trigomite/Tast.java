
package Trigomite;


public class Tast {
    
    public static void main(String[] args) {
        
        Shape [] p = new Shape[3];
        
        p[0] = new Shape();
       p[1] = new Triangle(10,20);
       p[2] = new Rectangle(15,10);
        
        
        
        
        
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("The area is :"+p[i].area());
            
        }
        
        
        
    }
    
}
