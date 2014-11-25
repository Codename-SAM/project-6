import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Student extends JFrame(){
  private String userid;
  private String password;
  
  public Student(){
    
    
    
  }
  
  void setName(String userid){
    this.userid = userid;
  }
  
  void setPass(String newPass){
    this.password = newPass;
  }
}
