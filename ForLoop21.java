import java.util.Scanner;

public class ForLoop21 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number :");
        int num = input.nextInt();
        

        System.out.print("[");
        for(int i = 0; i < num; i++){
            System.out.print(i + ",");

        }
        System.out.print("\b]");
    }
}
