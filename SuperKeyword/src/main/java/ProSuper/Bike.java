
package ProSuper;


public class Bike extends Vheacle {
    
    String name;
    String cc;
    
    Bike(String c, double w,String n, String cc)
    {
        super(c,w);
        name=n;
        this.cc=cc;
    }
    
    @Override
    void atrubite()
    {
        super.atrubite();
        System.out.println("The Name of the Bike IS: "+name);
        System.out.println("And CC is: "+cc);
        
    }
    
}
