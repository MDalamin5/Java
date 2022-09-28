
package Inhareitance2;


public class Teacher extends Person {
    
   private String qualifications;

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
   
  
    
    void display()
    {
        System.out.println("Name: "+getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Qualifications: "+ qualifications);
        
    }
}
