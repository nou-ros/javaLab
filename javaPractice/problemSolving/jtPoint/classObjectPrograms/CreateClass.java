public class CreateClass{
	private String name;
	private String breed;
	private int age;
	private String color;

	public CreateClass(String name, String breed, int age, String color)	    {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public String getName(){
		return name;
	}

	public String getBreed(){
		return breed;
	}

	public int getAge(){
		return age;
	}
	
	public String getColor(){
		return color;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setBreed(String breed){
		this.breed = breed;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String toString(){
		return ("Hi, I am " + this.name + ". I am of " + this.breed + " breed.\nMy age " + this.age + ", and a " + this.color + " color doggo.");
	}

	public static void main(String args[]){
		CreateClass tuffy = new CreateClass("tuffy", "papillon", 5, "white");
		System.out.println(tuffy);
	}
}
