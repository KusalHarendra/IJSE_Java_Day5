import java.util.Scanner;

public class ForLoop25 {
    public static void main(String args[]){
		int total = 0;
		double average = 0.0;

		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			System.out.print("Input marks for Subject " + (i+1) + " : ");
			int marks = input.nextInt();
			total += marks;
		}

		System.out.println("Total : " + total);
		System.out.println("Average : " + ((double)total/10));
	}

}
