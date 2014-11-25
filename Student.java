import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Student(){
  private String userid;
  private String password;
  private String [] courses = new String[5];
  
  public Student(){
    
    
    
  }
  
  public void setName(String userid){
    this.userid = userid;
  }
  
  public void setPass(String newPass){
    this.password = newPass;
  }
  
  
}
