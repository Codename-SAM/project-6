import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList


public class Student(){
  private String [][] userList = new String [studentNum][2];
  private ArrayList<String> courses = new ArrayList<String>(); 
  private double [][] hwGrade = new double [1][1];
  private double [][] projGrade = new double[1][1];
  private double [][] testGrade = new double [2][2];
  private char [][] letterGrades = new char[studentNum][2];
  
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
  
  private void addHWGrade(double newGrade){
    
  }
  
  private void addProjGrade(double newGrade){
    
  }
  
  private void addTestGrade(double newGrade){
    
  }

    
    
    
  }
  
  
}
