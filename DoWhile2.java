import java.util.*;

class Dowhile2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number : ");
		int num = input.nextInt();
		int count = 0;
		do{
            num /= 10;
			count++;   
        }
        while (num > 0);
		System.out.println("No of Digits : " + count);
	}
}
