import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number : ");
		int num = input.nextInt();

		int fact = 1;
		while(num > 0){
			fact *= num;
			num--;
		}

		System.out.println("Factorial is =" + fact);
	}

}
