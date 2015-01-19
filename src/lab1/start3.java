package lab1;

public class start3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human[] Alla = new Human[10];
		for(int i=0;i<5;i++){
			Alla[i] = new Human();		
		}
		for(int i=5; i<10;i++){
			try{
				Alla[i] = new simtek();
			}catch(IllegalArgumentException e)
			{
				  System.out.println(e.getMessage());
				  i--;
			}
		}
		
		
		for(Human i:Alla){
			System.out.println(i);
		}
		
	}

}
