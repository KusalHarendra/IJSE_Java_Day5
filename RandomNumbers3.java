import java.util.Random;

public class RandomNumbers3 {
    public static void main(String args[]){
		Random input = new Random();
		for(int i = 0; i < 10; i++){
			int val = input.nextInt(10)+1; // values between 0 and 10 (10 also applied)
			System.out.println("Value : " + val);	
		}
	}

}
