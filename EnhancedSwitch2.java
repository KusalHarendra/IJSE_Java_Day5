import java.util.Scanner;

public class EnhancedSwitch2 {
    public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a Number : ");
		int num = input.nextInt();
		/* String result = switch(num){     //support only in new JDK versions
			case 1 -> "Number 1";
			case 2, 3 -> "Number 2 or Number 3";
			case 4 -> "Number 4";
			case 5 -> "Number 5";
			default -> "Wrong Input";
		};

		System.out.println(result); */
    }
}
