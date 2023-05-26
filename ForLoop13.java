public class ForLoop13 {
    public static void main(String args[]){
		System.out.println("Start Main");
		for(int i = 0; i< 10; i++){
			System.out.println(i); // Legal
		}

		int i = 0;
		for(; i < 10; i++){
			System.out.println(i); // Legal
		}
		
		/*for(int i = 0; i< 10; i++){ // Illegal. cannot use i as a variable
			System.out.println(i);
		}   */
		
		System.out.println("End Main");
	}

}