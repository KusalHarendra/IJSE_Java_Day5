import java.util.Scanner;

public class ForLoop22 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number :");
        int num = input.nextInt();
        

        System.out.print("[");
        for(int i = 0; i < num; i++){
            System.out.print(i + ",");

        }
        System.out.print("\b]");
        if(num == 0){
            System.out.println("\bEmpty");
        }
        else{
        System.out.println("\bWrong Number");
        }
    }

    /*public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number : ");
		int num = input.nextInt();
		System.out.print("[");
		for(int i = 0; i < num; i++){
			System.out.print(i + ",");
		}
		System.out.println(num == 0? "\bEmpty" : num < 0? "\bWrong Number" : "\b]");
	}
 */
}
