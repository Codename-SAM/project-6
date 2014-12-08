import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList

public class Student(){
  private String userid;
  private String password;
  private ArrayList<String> courses = new ArrayList<String>(); 
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
    courses.add(newCourse);
  }
  

    
    
    
  }
  
  
}
