import java.util.Scanner;

class Person
	{

		protected String name;
		protected int age;
		String gender;

		//Constructor
		Person()
		{
		name = "Rajendra";
		age = 40;
		}

		void input()
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gender: ");
		gender=sc.next();
		}

		void output()
		{
		System.out.println("Name of the Person: " + name);
		System.out.println("Age of the Person: " + age);
		System.out.println("Gender of the Person: " + gender);
		}
	}// end of class

class MainPerson
	{
		public static void main(String a[])
		{

		Person p1=new Person();
		p1.input();

		p1.output();

		}

	}