import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class studentframe extends JFrame {

public static void main(String[] args) {
studentframe frameTabel = new studentframe();
}

JLabel welcome = new JLabel("Student List");
JPanel panel = new JPanel();

studentframe(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null); 

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

}
