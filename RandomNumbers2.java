import java.util.Random;

public class RandomNumbers2 {
    public static void main(String args[]){
        Random input = new Random();
		for(int i = 0; i < 10; i++){
			int val = input.nextInt(10); // 0 - 9
			System.out.println("Value : " + val);		
		}
    }
}
