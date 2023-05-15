public class Continue {
    public static void main(String args[]){
		System.out.println("Start");
		for(int i = 0; i< 10; i++){
			if(i == 5){
				continue;       //continue without printing i = 5
			}
			System.out.println("i : " + i);
		}
		System.out.println("End");
	}

}
