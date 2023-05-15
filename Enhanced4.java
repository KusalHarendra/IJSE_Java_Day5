import java.util.Scanner;

public class Enhanced4 {
    public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input Number : ");

		int num = input.nextInt();

		// if(num == 1 | num == 2){
		// 	if(num == 1){
		// 		System.out.println("A");
		// 	}
		// 	System.out.println("B");
		// } else {
		// 	System.out.println("Wrong Number");
		// }

        switch(num){
            case 1 : System.out.println("A");
            case 2 : System.out.println("B"); break;
            default : System.out.println("Wrong number");
        }
	}

}
