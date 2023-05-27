import java.util.Random;

class RandomNumbers1{
    public static void main(String args[]){
        Random input = new Random();
        int val = input.nextInt(); // int min - max

        System.out.println("Value : " + val);
    }
}