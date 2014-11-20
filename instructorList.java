public class Instructor
{
	private String username, password;


	public Instructor()
	{

	}

	public int login(String name, String pass)
	{
		if(name.equals("admin") && pass.equals("PASS13"))
		{
			return 1;
		}

		else
			return 0;
	}
}
