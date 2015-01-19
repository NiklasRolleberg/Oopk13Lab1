package lab1C;

public class Ram { //C
	
	public static void main(String[] arg) {

		int antalS = 0;
		int antalH = 0;		
		Human[] folk;
		//String[] arg = {"-S", "Niklas", "20","12","-H", "Babak","309","-S","Jessica","19","12"};
		
		for (String i : arg){				// Räknar ut hur många Human och simtekare det ska finnas
			if (i.equals("-S")){  					//http://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
				antalS += 1;
			}else if (i.equals("-H")){
				antalH += 1;
			}
		}
	
		folk = new Human[antalS+antalH];		// Skapar en array med rätt antal platser
		int j = 0;	//plats att lägga Human/simtekaren på
		
		for (int i=0;i<arg.length;i++){			// Lägger till simtekare och Human
			if (arg[i].equals("-S")){
				
			try{
				folk[j] = new simtek(Integer.parseInt(arg[i+2]),arg[i+1],2000+Integer.parseInt(arg[i+3]));	//http://stackoverflow.com/questions/5585779/how-to-convert-string-to-int-in-java
				j++;
				}catch(Exception e){
					if (e instanceof NumberFormatException){
						System.out.println("Nu skrev du fel");    //Om man skrivit fel
					}
					else if(e instanceof ArrayIndexOutOfBoundsException){
						System.out.println("Du gl�mde att skriva n�got");
					}
					else{
						System.out.println(arg[i+1]+" f�r inte g� simtek");
					}
				}
			}
			
			else if(arg[i].equals("-H")){
				try{
					folk[j] = new Human(Integer.parseInt(arg[i+2]),arg[i+1]);
					j++;
				}catch(Exception e){
					 if(e instanceof ArrayIndexOutOfBoundsException){
						System.out.println("Du gl�mde att skriva n�got");
					 }
					 else{
						 System.out.println("NU blev det fel!");
					 }
				}
			}
			}
		for (Human i : folk){
			if (i != null){
			System.out.println(i);
			}
		}
			
	}

}
