
package AbstractPrblm;


public class Circle extends Shape {
    
    Circle(double dim1, double dim2)
    {
        super(dim1,dim2);
    }
    
    @Override
    void display()
    {
        double result= Math.PI*dim1*dim2;
        System.out.println("The area of the Circle is: "+result);
    }
    
}
