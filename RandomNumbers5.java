import java.util.Random;

public class RandomNumbers5 {
    public static void main(String args[]){
		Random input = new Random();
		int num =0;
		while(num != 100){
			num = input.nextInt(101); 
			System.out.println("Value : " + num);	
		}
	}

}
