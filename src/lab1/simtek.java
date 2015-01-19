package lab1;

public class simtek extends Human{
	private int year;
	static String[] Name = {"Jessica", "Niklas", "Hannah", "Sofia"};
	
	simtek(){
		this((int) (Math.random()*50),Name[(int) (Math.random()*3)],2010+(int) (Math.random()*5));
	}
	
	simtek(int ageIn, String nameIn, int yearIn){
		if (yearIn>2011 && yearIn<2014){
			year = yearIn;
		}
		else{
			throw new IllegalArgumentException("FEEL");  //http://stackoverflow.com/questions/6942624/how-to-throw-a-general-exception-in-java
		}
		age = ageIn;
		name = nameIn;
	}
	public String toString(){
		return("Namn: "+name+", ålder "+age+" år, "+ "började simtek "+year);
	}
	
	public int getYear(){
		return(year);
	}

}
