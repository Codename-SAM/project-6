import javax.swing.*;

public class CourseList
{
	private int namesNum, instructorNum;

	private String[] names;
	private String[] instructor_usr;
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
		}

		public void setCourses()
		{
			int count = 0;
			names[count] = JOptionPane.showInputDialog("Enter the Name of Course " + (count + 1) + ", with the course number and title, like CSC142 Programming in Java");

			if(count < names.length)
			{
				setCourses();
			}
		}
}
