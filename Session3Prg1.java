import java.util.Scanner;

class Faculty extends Person
	{

		protected String designation;
		protected int salary;
		
		void input()
		{
		super.input();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Designation: ");
		designation=sc.next();
		System.out.println("Enter Salary: ");
		salary=sc.nextInt();
		}

		void output()
		{
		super.output();
		System.out.println("The designation is: " + designation);
		System.out.println("The salary is: " + salary);
		}
	}// end of class

class  Session3Prg1
	{
		public static void main(String a[])
		{

		Faculty f1=new Faculty();

		f1.input();

		f1.output();

		}

	}