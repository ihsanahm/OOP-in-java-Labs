import java.util.Scanner;
class task3
{
	public static void main (String args[])
	{
		
		Scanner num=new Scanner(System.in);
		int no1;
		System.out.print(" Enter the number :");
		no1=num.nextInt();
		double rat=0.025;
		double zakat= rat*no1;
		System.out.print(" You have to pay total zakat :"+zakat);
		
		

	}




}
