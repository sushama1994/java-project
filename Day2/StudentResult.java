package Day3;
import java.util.Scanner;
public class StudentResult{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of sub1 = ");
		int sub1 = scan.nextInt();	
		System.out.print("Enter the value of sub2 = " );
		int sub2 = scan.nextInt();	
		System.out.print("Enter the value of sub3 = " );
		int sub3 = scan.nextInt();	
		System.out.print("Enter the value ofsub4 = " );
		int sub4 = scan.nextInt();	
		System.out.print("Enter the value of sub5 = " );
		int sub5 = scan.nextInt();	
		float avg = (sub1+sub2+sub3+sub4+sub5)/5F;
		if(avg >= 40){
			System.out.println("Student passed with average = " +avg);
		}
		else{
			System.out.println("Student failed with average = " +avg);
		}
	}
}