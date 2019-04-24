/* SamK2020 
* this is a sample code to demonstrate derivative calculation of whole
* numbers using the power rule and product rule, other variables like
* trigonometry, fractions, reimann sums, etc not working. 
*/  
import java.util.Scanner;
public class DervWholeNbr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double Deriv, Power, result1, result2;
		final double MINUS = 1;
		
		System.out.print("Enter a whole number for the base: ");
		Deriv = input.nextDouble();
			if (Deriv == 0) {
				return;
			}
		System.out.print("Enter a whole number for the power:");
		Power = input.nextDouble();
			if(Power == 0) {
				return;
			}
			
		result1 = (Deriv * Power);
		result2 = (Power - MINUS);
		
		System.out.println("The result is: " + result1 +"^"+ result2);

	}

}
