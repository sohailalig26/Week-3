import java.util.Scanner;
public class Q5_distancebetween_2Points {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x coordinate of 1st point: ");
		double x1= sc.nextDouble();
			System.out.println("Enter y coordinate of 1st point: ");
		double y1= sc.nextDouble();
			System.out.println("Enter x coordinate of 2nd point: ");
		double x2= sc.nextDouble();
			System.out.println("Enter y coordinate of 2nd point: ");
		double y2= sc.nextDouble();
		double dist= Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.print("Distance between two points= "+dist);
	}
}