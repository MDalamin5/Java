
package playwithwrapper;


public class PlaywithNum {
    
    public static void main(String[] args) {
       
        String binary = "101011";
        
        int decemal1 = Integer.parseInt(binary, 2);
        
        System.out.println("The integer value is: "+decemal1);
        /*
        int octal = Integer.parseInt(binary, 8);
        
         System.out.println("The octal value is: "+octal);
         
         int hex = Integer.parseInt(binary, 16);
         System.out.println(" the hex value is: "+hex);
        */
        
        String oct = "456";
        
        int dec = Integer.parseInt(oct, 8);
        System.out.println(""+dec);
        
        String hex= "F";
        
        int dece= Integer.parseInt(hex,16);
        
        System.out.println(""+dece);
        
       
       //decemal to binarry, octa,hexa;
       
       int decemal = 15;
       
       String bin= Integer.toBinaryString(decemal);
        System.out.println("the binarry num is: "+bin);
        
        System.out.println(Integer.toOctalString(decemal));
        System.out.println(Integer.toHexString(decemal));
       
       
       
       
    }
    
}
