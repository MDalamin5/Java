
package com.mycompany.playwithfile;

import java.io.File;


public class FileDemo {
    public static void main(String[] args) {
        
       File dir = new File("Person");
       dir.mkdir();
       
       File file1 = new File("/Users/mdalamin/NetBeansProjects/PlayWithFile/Person/student.txt");
       File file2 = new File("/Users/mdalamin/NetBeansProjects/PlayWithFile/Person/teacher.txt");
       File fiel3 = new File(dir.getAbsolutePath()+ "/Comitey.txt");
       
       String path = dir.getAbsolutePath();
        System.out.println(path);
       
       
       try{
           
           file1.createNewFile();
           file2.createNewFile();
           fiel3.createNewFile();
           
           System.out.println("File are crated Succefully");
           
           
           
       }
       
       catch(Exception e){
           System.out.println(e);
           
       }
       
       file1.delete();
       
       if(file1.exists())
       {
           System.out.println("This file is exists");
       }
       
       else{
           System.out.println("Not Exists");
       }


                
       
        
    }
    
}
