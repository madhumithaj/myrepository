package com.javacodeexamples.basic.sorting;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
import com.javacodeexamples.common.Student;
 
public class SortArrayListExample {
 
    public static void main(String[] args) {
        
        //create an ArrayList
        ArrayList<Student> aListStudents = new ArrayList<Student>();
        
        //add student objects to ArrayList
        aListStudents.add( new Student("01", "Student1", "10th", 410) );
        aListStudents.add( new Student("02", "Student2", "10th", 290) );
        aListStudents.add( new Student("03", "Student3", "10th", 430) );
        aListStudents.add( new Student("04", "Student4", "10th", 375) );
        aListStudents.add( new Student("05", "Student5", "10th", 422) );
        
        //print unsorted ArrayList
        System.out.println("Unsorted ArrayList");
        for(Student student : aListStudents){
            System.out.println(student);
        }
        
        //sort arraylist
        Collections.sort(aListStudents, new StudentComparator());
        
        //print sorted arraylist
        System.out.println("Sorted ArrayList");
        for(Student student : aListStudents){
            System.out.println(student);
        }
        
    }
}
 
class StudentComparator implements Comparator<Student>{
    
    public int compare(Student student1, Student student2){
        
        if( student1.getTotalMarks() > student2.getTotalMarks() ){
            return 1;
        }else if( student1.getTotalMarks() < student2.getTotalMarks() ){
            return -1;
        }else{
            return 0;
        }
        
    }
}