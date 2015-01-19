package lab1;

import java.util.Arrays;

//Del 5
public class start4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human[] ALLA = new Human[2];
		for(int i=0;i<2;i++){
			try{
				ALLA[i] = new Human();
			}catch(IllegalArgumentException e)
			{
				  //System.out.println(e.getMessage());
				  i--;
			}
		}
		while (true){
			try{
				ALLA[0] = new simtek();
				break;
			}catch(IllegalArgumentException e){	}
		}
		
		Human a=ALLA[0];
		Human b=ALLA[1];
		Arrays.sort(ALLA); 											//http://stackoverflow.com/questions/8938235/java-sort-an-array
		
		System.out.println(ALLA[0].getName()+" år "+(ALLA[1].getAge()-ALLA[0].getAge())+ " år yngre än "+ALLA[1].getName()+", som är "+ALLA[1].getAge()+ "år\n");
		
		//del5.4
		
		ALLA = new Human[10];
		for(int i=0;i<5;i++){
			try{
				ALLA[i] = new simtek();
			}catch(IllegalArgumentException e)
			{
				  //System.out.println(e.getMessage());
				  i--;
			}	
		}
		for (int i=5;i<10;i++){
			ALLA[i]=new Human();
		}
		
		for (Human i:ALLA){
			System.out.println(i);
		}
		System.out.println("\n");
		
		Arrays.sort(ALLA);		
		for (Human i:ALLA){
			System.out.println(i);
		}
		
	}
	

}
