package Question1;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);


			
		System.out.print("Enter tuition interest rate for the second year: ");
			
			double interestrate1 = input.nextDouble();
		
		System.out.print("Enter tuition interest rate for the third year: ");
			
			double interestrate2 = input.nextDouble();
			
		System.out.print("Enter tuition interest rate for the fourth year: ");
			
			double interestrate3 = input.nextDouble();
				
			double tuition = 10000;
			
			
			double convertrate1 = (interestrate1/100)+1; 
			
			double convertrate2 = (interestrate2/100)+1; 
			
			double convertrate3 = (interestrate3/100)+1; 
			
			
			
					
			double tuition2 = tuition * convertrate1;
					
			double tuition3 = tuition2 * convertrate2;
					
			double tuition4 = tuition3 * convertrate3;
					
			double tuitiontotal = tuition + tuition2 + tuition3 + tuition4;

			System.out.print("The total tuition will be $");
			System.out.printf("%5.2f" + ".", tuitiontotal);
	}

}
