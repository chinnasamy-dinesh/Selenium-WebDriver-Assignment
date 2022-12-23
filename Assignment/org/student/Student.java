package Week_3.Day_1.Assignment.org.student;

import Week_3.Day_1.Assignment.org.department.Department;

// Multilevel Inheritance

public class Student extends Department
{

	public static void main(String[] args)
	{
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}

	public void studentName()
	{
		System.out.println("Student Name");
	}
	public void studentDept()
	{
		System.out.println("Student Dept");
	}
	public void studentId()
	{
		System.out.println("Student ID");
	}
	
}
