public class NestedLoops4 {
    public static void main(String args[]){
		for(int i = 0; i< 10; i++){
			for(int j = 0; j < 10; j++){
				if(j== 5){
					break;
				}
				System.out.println(i + " " + j);
			}
			System.out.println("------------");
		}
	}

}
