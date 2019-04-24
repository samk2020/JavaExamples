import java.util.Scanner;
public class AreaTri {
	public static void main(String args[]) { 
		
		double width, heigth, area;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width of the triangle: ");
		//double width = scanner.nextDouble();
		
		System.out.println("Enter the height of the triangle: ");
		double height = scanner.nextDouble();
		
		double height1 = scanner.nextDouble();
		double area = (width * height1) / 2;
		
		System.out.println("Area of the triangle is : " + area);
		
	}
	
} 

