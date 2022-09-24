
package playwithwrapper;

import java.util.Random;


public class RandomNumber {
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        int num = rand.nextInt(10);
        System.out.println("A random number is: "+num);
        
    }
    
}
