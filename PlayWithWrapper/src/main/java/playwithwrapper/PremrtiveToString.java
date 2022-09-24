
package playwithwrapper;


public class PremrtiveToString {
    
    public static void main(String[] args) {
        
        int x= 30;
        double b = 45.44;
        
        String s= Integer.toString(x);
        System.out.println("the string is: "+s);
        
        String ss = Double.toString(b);
        
        System.out.println("the double string value is: "+ss);
        
        
        // String to premetive data
        
        String s1= "44";
        
        int i = Integer.valueOf(s1);
        
        System.out.println(" the string value is: "+i);
        
        //Another Methode
        
        int j = Integer.parseInt(s1);
        
        double h = Double.valueOf(s1);
        System.out.println(i+" \n"+h);
        
        
        
        
    }
    
}
