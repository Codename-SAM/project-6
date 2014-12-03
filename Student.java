import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList

public class Student(){
  private String userid;
  private String password;
  private String [] courses = new String[]{"Courses: "};
  private double [][] hwGrade = new double [1][1];
  
  public Student(){
    
    
    
  }
  
  public void setName(String userid){
    this.userid = userid;
  }
  
  public void setPass(String newPass){
    this.password = newPass;
  }
  
  public void updateCourses(String newCourse){
    String [] updatedCourses = new String[courses.length + 1]; //instantiate the copy array
    int i = 0;
    for(; i<courses.length; i++){
      updatedCourses[i] = courses[i]; //copy the elements
      updatedCourses[courses.length] = [newCourse]; //the last index of the new array becomes the latest course
      RETURN THIS SUCH THAT THE COURSES ATTRIBUTE = THE UPDATED COURSES
    }
    
    
  }
  
  
}
