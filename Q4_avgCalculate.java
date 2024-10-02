import java.util.Scanner;
public class Q4_avgCalculate {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num 1: ");
		double num1= sc.nextDouble();
		System.out.println("Enter num 2: ");
		double num2= sc.nextDouble();
		System.out.println("Enter num 3: ");
		double num3= sc.nextDouble();
		double avg = ((num1+num2+num3)/3);
		System.out.println("Average of the given numbers is: "+avg);
	}
}