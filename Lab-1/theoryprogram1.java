class Student 
{
	int sid;
	String name;
	private char gender;
	private String PhoneN;
	private int age;
	private String adress;
	private String status;
	private String department;
	private String semester;
	private double gpa;
	char setgender(char g)
	{
		gender=g;
		return gender;
	}
	char getgender()
	{
		return gender;
		
	}
	int  setage(int g)
	{
		age=g;
		return age;
	}
	int getage()
	{
		return age;
		
	}
	String setphone(String g)
	{
		PhoneN=g;
		return PhoneN;
	}
	String getphone()
	{
		return PhoneN;
		
	}
	String setadress(String g)
	{
		adress=g;
		return adress;
	}
	String getadress()
	{
		return adress;
		
	}
	String setstatus(String g)
	{
		status=g;
		return status;
	}
	String getstatus()
	{
		return status;
		
	}
String setdepartment(String g)
	{
		department=g;
		return department;
	}
	String getdepartment()
	{
		return department;
		
	}
	String setsemester(String g)
	{
		semester=g;
		return semester;
	}
	String getsemester()
	{
		return semester;
		
	}
	double setGPA(double g)
	{
		gpa=g;
		return gpa;
	}
	double getGPA()
	{
		return gpa;
		
	}



}
public class theoryprogram1
{
	public static void main(String[] args)
		{
			Student s1=new Student();
			s1.sid=10;
			s1.name="Ihsan Ahmed ";
			s1.setgender('M');
			s1.setage(21);
			s1.setphone("03221091637");
			s1.setadress("The pak memon coprative housing socity sukkur ");
			s1.setstatus("Single ");
			s1.setdepartment("BS(cs) ");
			s1.setsemester(" 2nd ");
			s1.setGPA( 3.11 );
			
			System.out.println(" The stutent ID : "+s1.sid);
			System.out.println(" The stutent Name: "+s1.name);
			System.out.println(" The stutent gender : "+s1.getgender());
			System.out.println(" The stutent age : "+s1.getage());
			System.out.println(" The stutent mobile number : "+s1.getphone());
			System.out.println(" The stutent Address  : "+s1.getadress());
			System.out.println(" The stutent Status  : "+s1.getstatus());
			System.out.println(" The stutent department  : "+s1.getdepartment());
			System.out.println(" The stutent semester  : "+s1.getsemester());
			System.out.println(" The stutent GPA  : "+s1.getGPA());
			
			

		}

}