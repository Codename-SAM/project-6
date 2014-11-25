import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grade extends JFrame implements ActionListener
{
	private JTextField username;
	private JPasswordField password;
	private JButton login;
	private JLabel label;

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	private JTextField text1;
	private JButton button1;
	private JButton button2;
	private JButton button3;

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

		button1 = new JButton("Designate people");

		c.add(username);
		c.add(password);
		c.add(label);
		c.add(login);

		username.addActionListener(this);
		password.addActionListener(this);
		login.addActionListener(this);
		button1.addActionListener(this);

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
				setMainFrame();
			}

			else
			{
				label.setText("Please try again.");
			}
		}

		if(obj == button1)
		{
			cl.setCourses();
		}
	}

	public void setMainFrame()
	{
		c.removeAll();
		c.add(button1);
		setSize(600, 480);
		repaint();
	}

	public static void main(String[] args)
	{
		Grade g = new Grade();
	}
}
