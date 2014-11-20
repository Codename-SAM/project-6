import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grade extends JFrame implements ActionListener
{
	Container c = getContentPane();

	//Program-Login-Requirements-----
	private JTextField userField;
	private JPasswordField passField;
	private JButton loginButton;
	private JLabel label;
	//-------------------------------

	//Java-Classes-------------------
	CourseList cl = new CourseList();
	Instructor inst = new Instructor();

	//Admin-Content------
	int frameType = 0;

	public Grade()
	{
		super("Grade");
		setLayout(new FlowLayout());

		userField = new JTextField("admin", 10);
		passField = new JPasswordField("", 10);
		loginButton = new JButton("Login");
		label = new JLabel("Please enter your administrator login information.");

		c.add(userField);
		c.add(passField);
		c.add(loginButton);
		c.add(label);

		userField.addActionListener(this);
		passField.addActionListener(this);
		loginButton.addActionListener(this);

		setVisible(true);
		setResizable(false);
		setSize(400, 100);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object obj = e.getSource();
		String name = userField.getText();
		String pass = passField.getText();

		if(obj == loginButton)
		{
			frameType = inst.login(name, pass);
         login(frameType);
		}
	}

	public void login(int x)
	{
		if(x == 1)
		{
			label.setText("Welcome, Admin");
			setSize(800, 600);
			setResizable(true);
		}

		else
		{
			label.setText("Please enter a valid username/password combination.");
			setSize(400, 100);
			setResizable(false);
		}
	}

	public static void main(String[]args)
	{
		Grade g = new Grade();
	}
}
