import java.util.Scanner;

public class calculate {
	public static void main(String args[]) {
	Scanner calc = new Scanner(System.in);
	double fnam, snam, pick;
	System.out.println("Enter the first number : ");
	fnam = calc.nextDouble();
	System.out.println("Enter the second number : ");
	snam = calc.nextDouble();
	System.out.println("Enter 1 for : Addition ");
	System.out.println("Enter 2 for : Substraction ");
	System.out.println("Enter 3 for : Multiplication ");
	System.out.println("Enter 4 for : Divide  ");
	pick = calc.nextDouble();
	if(pick == 1) {
		System.out.println("Answer is : "+(fnam+snam));
	}
	else if(pick == 2) {
		System.out.println("Answer is : "+(fnam-snam));
	}
	else if(pick == 3) {
		System.out.println("Answer is : "+(fnam*snam));
	}
	else if(pick == 4) {
		System.out.println("Answer is : "+(fnam/snam));
	}
	else {
		System.out.println("Entered number is invalid");
	}
	
	}
}
