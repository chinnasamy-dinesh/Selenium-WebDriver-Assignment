package Week_3.Day_1.Assignment;

public class Students {

	public static void main(String[] args) 
	{
		Students s = new Students();
		s.getStudentInfo(202201, "Dinesh Chinnasamy");
		s.getStudentInfo(3);
		s.getStudentInfo("dinesh@gmail.com", 11124567);
	}
	public void getStudentInfo(int a)
	{
		System.out.println("Student Rank: "+a);
	}
	public void getStudentInfo(int a, String b)
	{
		System.out.println("Student Name: "+b);
		System.out.println("Student ID: "+a);
		
	}
	public void getStudentInfo(String b, int a)
	{
		System.out.println("Student Email: "+b);
		System.out.println("Student Mobile: "+a);
	}

}
