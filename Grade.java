import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grade extends JFrame implements ActionListener
{
	private JTextField username;
	private JPasswordField password;
	private JLabel label;
	private JButton login;
	private Container c;
	private CourseList cl;

	public Grade()
	{
		super("Grade");
		c = getContentPane();
		c.setLayout(new FlowLayout());

		cl = new CourseList();

		username = new JTextField("admin", 10);
		password = new JPasswordField("PASS13", 10);
		label = new JLabel("Please enter the username/password combination.");
		login = new JButton("Login");

		c.add(username);
		c.add(password);
		c.add(label);
		c.add(login);

		username.addActionListener(this);
		password.addActionListener(this);
		login.addActionListener(this);

		setSize(400, 100);
		setResizable(false);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object obj = e.getSource();
		String user = username.getText();
		String pass = password.getText();


		if(obj == login)
		{
			if(user.equals("admin") && pass.equals("PASS13"))
			{
				cl.setLength();
				cl.setCourses();
				setVisible(false);
			}

			else
			{
				label.setText("Please try again.");
			}
		}
	}

	public static void main(String[] args)
	{
		Grade g = new Grade();
	}
}
