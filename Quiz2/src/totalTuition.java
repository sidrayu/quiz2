import java.util.Scanner;
import java.text.DecimalFormat;

public class totalTuition {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Tuition for the first year:");
		double firstYearToition = s.nextDouble();
		
		System.out.println("Enter the percentage increased First year:");
		double percentage = s.nextDouble();

		double totalTuition = firstYearToition;
		
		for (int year=1; year<4; year++){
			totalTuition += firstYearToition*(1+percentage/100);
			firstYearToition = firstYearToition*(1+percentage/100);
		}

		System.out.printf("The total cost of tuition to complete a degree is:%.2f \n",totalTuition);
	}
	
}
