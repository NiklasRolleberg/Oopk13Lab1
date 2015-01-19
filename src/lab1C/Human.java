package lab1C;

public class Human implements Comparable{
	protected int age;
	protected String name;
	static String[] Name = {"anna", "karin", "peter", "martin"};
	public Human(){
		this((int) (Math.random()*50),Name[(int) (Math.random()*3)]);
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
	public int compareTo(Object a) {
	if (((Human) a).getAge() > age){
			return 1;
		}
	else if (((Human) a).getAge() == age){
		if (a instanceof simtek && this instanceof simtek){
			if (((simtek) a).getYear()<(((simtek) this).getYear())){  
				return 1;	
			}
			else if (((simtek) a).getYear()==(((simtek) this).getYear())){
				return 0;	
			}
			return -1;
		}	
	}
		return -1;
	}


}
