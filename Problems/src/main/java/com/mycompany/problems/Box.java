
package com.mycompany.problems;


public class Box {
    
    double height, width, depth;
    
     Box(double height, double width, double depth)
     {
         this.height= height;
         this.width= width;
         this.depth= depth;
         
     }
     
     void display()
     {
         System.out.println("Volume of the box is: "+(height*width*depth));
     }
    
    
}
