import javax.swing.*;

public class CourseList
{
	private int namesNum, instructorNum, studentNum;
	private String[] names;          //number of classes
	private String[] instructor_usr; //number of professors
	private String[] students;       //number of students in general
	private int[] number_of_enroll;  //number of studens enrolled
	private String[][] student_list; //A 2-D array of all the rosters with the respective students in each class, this comes last

	public CourseList()
	{

	}

		public void setLength()
		{
			String num = JOptionPane.showInputDialog("How many classes should be initialzied?");
			namesNum = Integer.parseInt(num);
			names = new String[namesNum];
			num = JOptionPane.showInputDialog("How many professors should be initialized?");
			instructorNum = Integer.parseInt(num);
			instructor_usr = new String[instructorNum];
			num = JOptionPane.showInputDialog("How many students should be initialized");
			studentNum = Integer.parseInt(num);
			students = new String[studentNum];
		}

			public String[] getCourses()
			{
				return names;
			}

			public String[] getStudents()
			{
				return students;
			}

				public void setCourses()
				{
					for(int a=0; a < names.length; a++)
					{
						names[a] = JOptionPane.showInputDialog("Set the name of course " + a);
					}
				}

				public void setStudents()
				{
					for(int a=0; a < students.length; a++)
					{
						students[a] = JOptionPane.showInputDialog("Set the name of student " + a);
					}
				}
}
