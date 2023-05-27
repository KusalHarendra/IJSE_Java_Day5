import java.util.Scanner;

public class Switch3 {
    public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a Number : ");
		int num = input.nextInt();

        // switch(num){
		//  	case 1 : result = "Number 1"; break;
		//  	case 2, 3 : result = "Number 2 or Number 3"; break;
		//  	case 4 : result = "Number 4"; break;
		//  	case 5 : result = "Number 5"; break;
		//  	default : result = "Wrong input";
		// }

		/*String result = switch (num) {          //only for primitive data types - byte,short,int,char
                                                //wrapper class - Byte,Short,Int,Character
                                                // String , enum
			case 1 : yield "Number 1";
			case 2,3 : yield "Number 2 or Number 3";
			case 4 : yield "Number 4";
			case 5 : yield "Number 5";
			default : yield "Wrong input";
		};

		System.out.println(result); */      //only working in newest java versions
    }
}
