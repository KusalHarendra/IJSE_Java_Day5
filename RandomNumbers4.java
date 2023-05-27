import java.util.Random;

public class RandomNumbers4 {
    public static void main(String args[]){
		Random input = new Random();
		for(int i = 0; i < 100; i++){
			int val = input.nextInt(50)+51; // values between 50 and 101 
			System.out.println("Value : " + val);	
		}
	}

}