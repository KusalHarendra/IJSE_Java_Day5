public class NestedLoops5 {
    public static void main(String args[]){
		L1:for(int i = 0; i< 10; i++){      //name the 1st loop by L1
			L2:for(int j = 0; j < 10; j++){      //name the 2nd loop by L2
				if(j== 5){
					break L1;           //break the 1st loop
				}
				System.out.println(i + " " + j);
			}
			System.out.println("------------");
		}
	}

}
