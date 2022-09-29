
package ProSuper;


public class Car extends Vheacle {
    
    String name;
    
    Car(String c, double w, String n)
    {
        super(c,w);
        name= n;
        
    }
    
    @Override
    void atrubite()
    {
        
        super.atrubite();
        System.out.println("THe name of the car : "+name);
        System.out.println("\n");
    }
    
    
    
    
}
