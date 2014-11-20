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

	//Admin-Content------

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
			login(name, pass);
		}
	}

	public void login(String name, String pass)
	{
		if(name.equals("admin") && pass.equals("PASS13"))
		{
			label.setText("Login Successful!");
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
