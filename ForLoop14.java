public class ForLoop14 {
    public static void main(String args[]){
		int i = 0;
		for(int j = 0; j < 10; j++){
			int k = 0;
			System.out.println(i + " " + j + " " + k);
			k++;
			i++;
		}

		System.out.println(i); // legal
		//System.out.println(j); // illegal
		//System.out.println(k); // illegal
	}

}
