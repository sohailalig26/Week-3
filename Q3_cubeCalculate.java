import java.util.Scanner;
public class Q3_cubeCalculate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		double n= sc.nextDouble();
		double cube= n*n*n;
		System.out.println("Cube of the given no.: "+cube);
	}
}