package Question1;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter tuition interest rate: ");
			
			double interestrate1 = input.nextDouble();
					
			double tuition = 12342;
					
			double convertrate1 = (interestrate1/100)+1; 
												
			double tuition2 = tuition * convertrate1;
					
			double tuition3 = tuition2 * convertrate1;
					
			double tuition4 = tuition3 * convertrate1;
					
			double tuitiontotal = tuition + tuition2 + tuition3 + tuition4;

			System.out.print("The total tuition will be $");
			System.out.printf("%5.2f" + ".", tuitiontotal);
	}

}
