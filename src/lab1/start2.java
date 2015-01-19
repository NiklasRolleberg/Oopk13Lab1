package lab1;

public class start2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human[] Alla = new Human[15];
		for(int i=0;i<15;i++){
			Alla[i] = new Human();
		}
		for( Human i : Alla ){
			System.out.println(i);
		}
		
		simtek[] ALLA = new simtek[15];
		for(int i=0;i<15;i++){
			try{
				ALLA[i] = new simtek();
			}catch(IllegalArgumentException e)
			{
				  System.out.println(e.getMessage());
				  i--;
			}
		}
		for(simtek i:ALLA){
			System.out.println(i);
		}
	}

}
