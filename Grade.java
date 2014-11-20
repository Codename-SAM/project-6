import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grade extends JFrame implements ActionListener
{
	//Login-Requirements-------------
	private JTextField userField;
	private JPasswordField passField;
	private JButton loginButton;
	//-------------------------------

	private JPanel panel;
	private JLabel label;
	private ImageIcon img;

	public Grade()
	{
		super("Grade");
		Container c = getContentPane();
		setLayout(new FlowLayout());

		panel = new JPanel(new GridLayout(1,1));
		img = new ImageIcon("EricAndre.gif");
		label = new JLabel(img);

			//Login-Initialization-----------------------------
			userField = new JTextField("admin", 10);
			passField = new JPasswordField("password", 15);
			loginButton = new JButton("Login");

			c.add(userField);
			c.add(passField);
			c.add(loginButton);

			c.add(label);

			userField.addActionListener(this);
			passField.addActionListener(this);
			loginButton.addActionListener(this);
			//--------------------------------------------------

		setVisible(true);
		setSize(600, 400);
		openProgram(0);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object obj = e.getSource();
		String name = userField.getText();
		String pass = passField.getText();

		if(obj == loginButton)
		{
			if(name.equals("admin") && pass.equals("PASS13"))
			{
				System.out.println("Successful Login!");
				openProgram(1);
			}

			else
			{
				openProgram(0);
			}
		}

	}

	public void openProgram(int x)
	{
		if(x == 1)
		{
			label.setVisible(true);
		}

		else
		{
			label.setVisible(false);
		}

	}

	public static void main(String[]args)
	{
		Grade g = new Grade();
		g.setVisible(true);
	}
}