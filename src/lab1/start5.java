package lab1;

public class start5 { //C

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		simtek[] ALLA = new simtek[2];
		for(int i=0;i<2;i++){
			try{
				ALLA[i] = new simtek();
			}catch(IllegalArgumentException e)
			{
				  i--;
			}
		}
		for(simtek i:ALLA){
			System.out.println(i);
		}
		
		simtek a=ALLA[0];
		simtek b=ALLA[1];
		
		System.out.println(a.compareTo(b));
		
	}

}
