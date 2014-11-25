import javax.swing.*;

public class CourseList
{
	private int namesNum, instructorNum, studentNum;

	private String[] names;
	private String[] instructor_usr;
	private String[] students;
	private int[] number_of_enroll; //number of studens enrolled
	private String[][] student_list; //A 2-D array of all the rosters with the respective students in each class, this comes last

	public CourseList()
	{
		names = new String[namesNum];
		instructor_usr = new String[instructorNum];
	}

		public void setLength()
		{
			String num = JOptionPane.showInputDialog("How many classes should be initialzied?");
			namesNum = Integer.parseInt(num);
			num = JOptionPane.showInputDialog("How many professors should be initialized?");
			instructorNum = Integer.parseInt(num);
			num = JOptionPane.showInputDialog("How many students should be initialized");
			studentNum = Integer.parseInt(num);
		}

			public void setCourses()
			{
				System.out.println("Called!");

				for(int a=0; a < names.length; a++)
				{
					System.out.println("accessed for loop");
					names[a] = JOptionPane.showInputDialog("Set the name of course " + a);
				}
			}
}
