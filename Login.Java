import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
	private JPanel panel;
	private JButton button;

	private Container c;

	private boolean confirmation;

	private JTextField username;
	private JPasswordField password;

	Login()
	{
		super("Login");
		setSize(300,200);
		setLocation(500,280);

		username = new JTextField("admin", 10);
		password = new JPasswordField("PASS13", 10);

		c = getContentPane();

		panel.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		button.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e)
	{
		String user = username.getText();
		String pass = password.getText();

		if(user.equals("admin") && pass.equals("PASS13"))
		{
			confirmation = true;
		}

		else
		{
			confirmation = false;
			JOptionPane.showMessageDialog(null, "Wrong Password / Username");
			username.requestFocus();
		}
	}

	public void loginFrame()
	{
		c.removeAll();
		c.add(username);
		c.add(password);
		c.add(button);
		setSize(400, 100);
		setLayout(new FlowLayout());
		repaint();
	}

	public boolean getCondition()
	{
		return confirmation;
	}

	public static void main(String[] args)
	{
		Login frameTable = new Login();
	}
}
