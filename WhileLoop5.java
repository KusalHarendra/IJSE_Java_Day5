import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("input a number : ");
        int num = input.nextInt();

        int count = 0; 
        while(num > 0){
            num = num / 10;
            count++;
        }
        System.out.println("No of Digits : " + count);

    }
}
