
package StudentLIstDemo;

import java.util.LinkedList;


public class StuLIst {
    public static void main(String[] args) {
        
        LinkedList<Student> list = new LinkedList<Student>();
        
        Student s1 = new Student(1811, "ALamin", "BSC");
        
        Student s2 = new Student(1812, "Kaysar", "BSC");
        Student s3 = new Student(1813, "Tanvir", "BSC");
        Student s4 = new Student(1814, "Shihab", "BSC");
        Student s5 = new Student(1815, "Omlan", "BSC");
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        for(Student s:list)
        {
            System.out.println(s.id+"  "+s.Name +" "+s.ClassName);
        }
        
        
        
        
        
    }
    
}
