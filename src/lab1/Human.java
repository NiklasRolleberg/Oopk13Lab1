package lab1;

public class Human implements Comparable<Human>{
	
	protected int age;
	protected String name;
	static String[] Name = {"anna", "karin", "peter", "martin"};
	
	public Human(){
		this((int) (Math.random()*50),Name[(int) (Math.random()*3)]); // Typecasting
	}
	
	public Human(int ageIn, String nameIn){
		age = ageIn;
		name = nameIn;
	}
	public String toString(){
		return("Namn: "+name+", ålder "+age+" år");
	}
	public int getAge(){
		return(age);
	}
	public String getName(){
		return(name);
	}

	@Override
	public int compareTo(Human a) { //lite fel
		if ( a.getAge() <= age){
			return 1;
		}
		return 0;
	}


}
