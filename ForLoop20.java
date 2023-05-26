public class ForLoop20 {
    public static void main(String args[]){
        System.out.print("[");
        for(int i = 0; i < 10; i++){
            System.out.print(i + ",");

        }
        System.out.print("\b]");    //('\b' +"]") also correct
    }
}
