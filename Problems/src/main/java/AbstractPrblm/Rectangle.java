
package AbstractPrblm;


public class Rectangle extends Shape{
    
    Rectangle(double dim1, double dim2)
    {
        super(dim1,dim2);
    }
    
    @Override
    void display()
    {
        double result= dim1*dim2;
        System.out.println("The are of the rectangle is: "+result);
    }
    
}
