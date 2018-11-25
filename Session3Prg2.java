import java.util.Scanner;

class Student
	{

		private String name;
		private long pno, rno;
		private int grade;

		//function setters
		void input()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Student: ");
		name=sc.next();
		System.out.println("Enter the phone number of the Student: ");
		pno=sc.nextLong();
		System.out.println("Enter the Roll number of the Student: ");
		rno=sc.nextLong();
		System.out.println("Enter the class of the Student: ");
		grade=sc.nextInt();
		}

		// function getter
		void output()
		{
		System.out.println("Name of the Student: " + name);
		System.out.println("Phone Number of the Student: " + pno);
		System.out.println("Roll Number of the Student: " + rno);
		System.out.println("Class of the Student: " + grade);
		}
	}// end of class

class Session3Prg2
	{
		public static void main(String a[])
		{

		Student p1=new Student();

		p1.input();

		p1.output();

		}

	}