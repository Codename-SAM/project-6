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

	private JList list;

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton logout;

	private JButton resume;

	private JFrame frame;

	private Container c;
	private CourseList cl;
	private Instructor I;

	private boolean firstlogin;

	public Grade()
	{
		super("Grade");
		c = getContentPane();
		c.setLayout(new FlowLayout());

		cl = new CourseList();
		I = new Instructor();

		username = new JTextField("admin", 10);
		password = new JPasswordField("PASS13", 10);
		label = new JLabel("Please enter the username/password combination.");
		login = new JButton("Login");

		firstlogin = true;

		frame = new JFrame();

		button1 = new JButton("Designate courses");
		button2 = new JButton("Designate professors");
		button3 = new JButton("Designate students");
		button4 = new JButton("Display courses");
		button5 = new JButton("Display professors");
		button6 = new JButton("Display students");
		logout = new JButton("Log Out");

		resume = new JButton("Display Content");

		c.add(username);
		c.add(password);
		c.add(label);
		c.add(login);

		username.addActionListener(this);
		password.addActionListener(this);
		login.addActionListener(this);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		logout.addActionListener(this);

		setSize(400, 100);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object obj = e.getSource();
		String user = username.getText();
		String pass = password.getText();

		if(obj == login && firstlogin == true)
		{
			if(user.equals("admin") && pass.equals("PASS13"))
			{
				cl.setLength();
				firstFrame();
			}

			else
			{
				label.setText("Please try again.");
			}
		}

		if(obj == login && firstlogin == false)
		{
			I.login(user, pass);
		}

			if(obj == button1)
			{
				cl.setCourses();
			}

			if(obj == button2)
			{
				cl.setInstructors();
			}

			if(obj == button3)
			{
				cl.setStudents();
			}

			if(obj == button4)
			{
				displayCourses(cl.getCourses());
			}

			if(obj == button5)
			{
				displayInstructors(cl.getInstructors());
			}

			if(obj == button6)
			{
				displayStudents(cl.getStudents());
			}

		if(obj == logout)
		{
			firstScreen();
		}
}

	public void firstFrame()
	{
		c.removeAll();
		c.setLayout(new GridLayout(3, 2));
		c.add(button1);
		c.add(button2);
		c.add(button3);
		c.add(button4);
		c.add(button5);
		c.add(button6);
		c.add(logout);
		setSize(600, 480);
		repaint();
	}

	public void firstScreen()
	{
		c.removeAll();
		c.add(username);
		c.add(password);
		c.add(label);
		c.add(login);
		setSize(400, 100);
		setLayout(new FlowLayout());
		repaint();
	}

	public void displayStudents(String[] temp)
	{
		list = new JList(temp);
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        new ListSelectionListener()
        {
        	public void valueChanged(ListSelectionEvent event)
        	{
				list.getSelectedIndex();
			}
		}
		);

		frame.setLayout(new FlowLayout());
		frame.add(new JScrollPane(list));
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public void displayInstructors(String[] temp)
	{
		list = new JList(temp);
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        new ListSelectionListener()
        {
        	public void valueChanged(ListSelectionEvent event)
        	{

			}
		}
		);

		frame.setLayout(new FlowLayout());
		frame.add(new JScrollPane(list));
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public void displayCourses(String[] temp)
	{
		list = new JList(temp);
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        new ListSelectionListener()
        {
        	public void valueChanged(ListSelectionEvent event)
        	{

			}
		}
		);

		frame.setLayout(new FlowLayout());
		frame.add(new JScrollPane(list));
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		Grade g = new Grade();
	}
}
