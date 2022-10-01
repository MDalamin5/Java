
package AbstractPrblm;


public class Test {
    
    public static void main(String[] args) {
        
        Shape s;
        s= new Circle(5,5);
        s.display();
        
        s= new Rectangle(5,7);
        s.display();
        
        s= new Triangle(5,4);
        s.display();
        
    }
    
}
