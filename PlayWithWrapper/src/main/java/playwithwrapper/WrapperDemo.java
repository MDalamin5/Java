
package playwithwrapper;

/**
 *
 * @author mdalamin
 */
public class WrapperDemo {
    public static void main(String[] args) {
        
        int x=34;
        Integer y= Integer.valueOf(x);
        System.out.println(" the vlre of: "+x);
        
        System.out.println(Integer.valueOf(5));
        
        //auto boxing;
        
        Integer z=x;
        System.out.println("z");
        
        
       // Object to premetive
       
       Integer i=44;
       
       //converting
       
       int m = i.intValue();
        System.out.println("THe value of : "+m);
       
        
        
        
    }
}
