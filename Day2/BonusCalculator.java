import java.util.Scanner;
public class BonusCalculator{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<6; i++){
			System.out.println("Enter sale amount");
			int sale_amount = scan.nextInt();
			if(sale_amount >= 10000){
				System.out.println("Eligible for Bonus.");
				float bonus_amount = (float)sale_amount * (20f / 100);
				System.out.println("bonus_amount = " + bonus_amount);
			}else{
                  	System.out.println("Not Eligible for Bonus.");
			}
		}
      }
}