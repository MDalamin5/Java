
package AbstractPrblm;


public class Triangle extends Shape{
     Triangle(double dim1, double dim2)
    {
        super(dim1,dim2);
    }
    
    @Override
    void display()
    {
        double result= 0.5*dim1*dim2;
        System.out.println("The are of the Triangle is: "+result);
    }
}
