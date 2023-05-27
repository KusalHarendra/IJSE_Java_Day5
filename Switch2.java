import java.util.*;

class Switch2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a Number : ");
		int num = input.nextInt();

		/*if(num == 1){
			System.out.println("Number 1");
		} else if(num == 2 | num == 3){
			System.out.println("Number 2 or Number 3");
		} else if(num == 4){
			System.out.println("Number 4");
		} else if(num == 5){
			System.out.println("Number 5");
		} else {
			System.out.println("Wrong input");
		}*/

		switch(num){
		 	case 1 : System.out.println("Number 1"); break;
		 	case 2 :                                                    //no body in case 2, jump into case 3 then
		 	case 3 : System.out.println("Number 2 or Number 3"); break;
		 	case 4 : System.out.println("Number 4"); break;
		 	case 5 : System.out.println("Number 5"); break;
		 	default : System.out.println("Wrong input");
		}
	}
}
