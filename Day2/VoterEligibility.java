import java.util.Scanner;
public class VoterEligibility{
	public static void main(String [] args){
		int minimum_age = 18;
		int maximum_age = 100;
		for(int i=0; i<10; i++){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			if((minimum_age<=number1 && number1<=maximum_age)&&(minimum_age<=number2 && number2<=maximum_age)){
				System.out.println("Eligible for votting.");
			}
			else{
				System.out.println("Not eligible for votting.");
			}
		}
	}
}