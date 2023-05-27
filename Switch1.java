import java.util.Scanner;

public class Switch1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num = input.nextInt();

        /*if(num == 1){
            System.out.println("Number 1");
        }
        else if(num == 2){
            System.out.println("Number 2");
        }
        else if(num == 3){
            System.out.println("Number 3");
        }
        else if(num == 4){
            System.out.println("Number 4");
        }
        else if(num == 5){
            System.out.println("Number 5");
        }
        else{
            System.out.println("Wrong Input");
        }   */
        
        /*switch(num){
            case 1 :System.out.println("Number 1");
            case 2 : System.out.println("Number 2");
			case 3 : System.out.println("Number 3");
			case 4 : System.out.println("Number 4");
			case 5 : System.out.println("Number 5");
			default : System.out.println("Wrong input");        //there is a small issue,have to use "break" after each line.
        }   */

        switch(num){
            case 1 :System.out.println("Number 1"); break;
            case 2 : System.out.println("Number 2"); break;
			case 3 : System.out.println("Number 3"); break;
			case 4 : System.out.println("Number 4"); break;
			case 5 : System.out.println("Number 5"); break;
			default : System.out.println("Wrong input");        
        }
    }
}