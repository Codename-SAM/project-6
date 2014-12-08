import javax.swing.*;

public class CourseList
{
	public int namesNum = 0, instructorNum = 0, studentNum = 0;

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
			String num;

			while(namesNum < 1)
			{
				num = JOptionPane.showInputDialog("How many courses should be initialzied?");
				namesNum = Integer.parseInt(num);
			}

			names = new String[namesNum];

				while(instructorNum < 2)
				{
					num = JOptionPane.showInputDialog("How many professors should be initialized?");
					instructorNum = Integer.parseInt(num);
				}

				instructor_usr = new String[instructorNum];

				while(studentNum < 5)
				{
					num = JOptionPane.showInputDialog("How many students should be initialized");
					studentNum = Integer.parseInt(num);
				}

				students = new String[studentNum];
		}

			public String[] getCourses()
			{
				return names;
			}

				public void updateCourses(String[] temp)
				{
					names = temp;
				}

			public String[] getStudents()
			{
				return students;
			}

				public void updateStudents(String[] temp)
				{
					students = temp;
				}

			public String[] getInstructors()
			{
				return instructor_usr;
			}

				public void updateInstructors(String[] temp)
				{
					instructor_usr = temp;
				}

				public void setCourses()
				{

				}

				public void setStudents()
				{

				}

				public void setInstructors()
				{

				}
}
