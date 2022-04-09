import java.util.Scanner;

public class Find_Greater_Number {

	public static void main (String args[])
	{
		Find_Greater_Number gn=new Find_Greater_Number();
	gn.find_greater_number();
	
}

	private void find_greater_number() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		
		int Number1=Sc.nextInt();
		System.out.println("Enter Second Number ");
		int Number2=Sc.nextInt();
	if(Number1>Number2) {
		
		System.out.println("Greater Number is "+ Number1) ;
	}
	else {
		System.out.println("Greater Number is "+ Number2) ;
	}
	}
	}
	

