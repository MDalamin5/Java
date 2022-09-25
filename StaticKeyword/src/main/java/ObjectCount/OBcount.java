
package ObjectCount;


public class OBcount {
    
    String name;
    
   static int count=0;
    
    OBcount()
    {
        count++;
    }
    
    OBcount(String s)
    {
        name=s;
        
    }
    
    
    void DisplayInfo()
    {
        System.out.println("Total object is: "+count);
        
    }
    
    
}
