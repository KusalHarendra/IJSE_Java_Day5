import java.util.Scanner;

public class ForLoop23 {
    public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		System.out.print("Input lower value : ");
		int lowerNum = input.nextInt();
        System.out.print("Input upper value : ");
		int upperNum = input.nextInt();


		System.out.print("[");
		for(int i = lowerNum; i < upperNum; i++){
			System.out.print(i + ",");
		}
		System.out.println(lowerNum >= upperNum? "\bWrong inputs" : "\b]");
	}
}
