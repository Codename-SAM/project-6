import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import java.awt.*;

public class Grade extends JFrame implements ActionListener
{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;

	private JButton logout;

	private JButton resume;
	private JFrame frame;
    private JPanel panel;

	private Container c;

	private CourseList cl;
	private Instructor I;
	private Login log;
    private Table table;

	private boolean firstlogin;

	public Grade()
	{
		super("Grade");
		c = getContentPane();
		c.setLayout(new FlowLayout());

		cl = new CourseList();
		I = new Instructor();
        table = new Table();

		firstlogin = true;

		frame = new JFrame();
        panel = new JPanel();

		button1 = new JButton("Students");
		button2 = new JButton("Instructors");
		button3 = new JButton("Designate students");
		button4 = new JButton("Display courses");
		button5 = new JButton("Display professors");
		button6 = new JButton("Display students");
		logout = new JButton("Log Out");
		resume = new JButton("Continue");

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
        resume.addActionListener(this);
		logout.addActionListener(this);

		setSize(400, 100);
		setVisible(true);

		log.loginFrame();
	}

	public void actionPerformed(ActionEvent e)
	{
		Object obj = e.getSource();

		if(log.getCondition() == true)
		{
			if(obj == button1)
			{
				studentFrame();
			}

			if(obj == button2)
			{
				instructorFrame();
			}

			if(obj == button3)
			{

			}

			if(obj == button4)
			{

			}

			if(obj == button5)
			{

			}

			if(obj == button6)
			{

			}

         if(obj == resume)
         {

         }

		if(obj == logout)
		{
			log.loginFrame();
         	frame.setVisible(false);
		}
	}
	}

	public void adminFrame()
	{
		c.removeAll();
		c.setLayout(new GridLayout(2, 3));
        c.add(button1);
        c.add(button2);
        c.add(resume);
		c.add(logout);
		setSize(600, 480);
		repaint();
	}

   public void instructorFrame()
   {
      c.setVisible(false);
      table.createAndShowGUI();
   }

   public void studentFrame()
   {
      c.setVisible(false);
   }

	public static void main(String[] args)
	{
		Grade g = new Grade();
	}
}
