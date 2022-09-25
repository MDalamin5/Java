
package StaticBlock;


public class Staticblock {
    
    static int x;
    static  String name;
    
    static
    {
        
        x=44;
        name= "Al min";
    }
    
    static void display(){
        System.out.println(""+x);
        System.out.println(""+name);
    }
    
}
