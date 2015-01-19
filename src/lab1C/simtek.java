package lab1C;

public class simtek extends Human{
	private int year;
	static String[] Name = {"Jessica", "Niklas", "Hannah", "Sofia"};
	
	simtek(){
		this((int) (Math.random()*50),Name[(int) (Math.random()*3)],2000+(int) (Math.random()*15));
	}
	
	simtek(int ageIn, String nameIn, int yearIn){
		if (yearIn>2000 && yearIn<2014){
			year = yearIn;
		}
		else{
			throw new IllegalArgumentException("FEEL");  //http://stackoverflow.com/questions/6942624/how-to-throw-a-general-exception-in-java
		}
		age = ageIn;
		name = nameIn;
	}
	public String toString(){
		int tiotal=year%100;
		String tio=Integer.toString(tiotal);
		if (tiotal<10){
			tio="0"+Integer.toString(tiotal);
		}
		return("Namn: "+name+", ålder "+age+" årskurs "+ "T-"+tio);
	}
	
	public int getYear(){
		return(year);
	}

}
