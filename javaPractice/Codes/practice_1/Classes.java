/* Write few classes with multiple constructor, static and non static blocks.
 * Add member variables and class level variables. Assign values to those variables using
 * different mechanisms. Print values from the classes.
*/

abstract class Animal{
	double weight;
	int age;
	
	Animal()
	{
		this.weight = 0;
		this.age = 0;
	}
	
	Animal(double weight){
		this.weight = weight;
		this.age = 0;
	}
	
	Animal(double weight, int age){
		this.weight = weight;
		this.age = age;
	}
	
	void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	void setAge(int age)
	{
		this.age = age;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	int getAge()
	{
		return this.age;
	}
	
	void run()
	{
		System.out.println("Can run at 1km per hour");
	}
	
	abstract void selfDisc();
	
	static void story()
	{
		System.out.println("This is a story of an Animal.");
	}
}

class Dog extends Animal{
	Dog()
	{
		super();
	}
	
	Dog(double weight)
	{
		super(weight);
	}
	
	Dog(double weight, int age)
	{
		super(weight, age);
	}
	
	void run()
	{
		System.out.println("Can run at 30km per hour");
	}
	
	void selfDisc()
	{
		System.out.println("I ama a dog and this is my story.");
	}
	
	static void story()
	{
		System.out.println("This is a story of a dog");
	}
}

class Cat extends Animal{
	Cat()
	{
		super();
	}
	
	Cat(double weight)
	{
		super(weight);
	}
	
	Cat(double weight, int age)
	{
		super(weight, age);
	}
	
	void run()
	{
		System.out.println("Can run at 22km per hour");
	}
	
	void selfDisc()
	{
		System.out.println("I am a cat and this my story, thank you for listening!!!");
	}
	
	static void story()
	{
		System.out.println("This is a story of a cat.");
	}
}

public class Classes {
	public static void main(String[] args)
	{
		Animal dogOne = new Dog(10.0);
		Animal dogTwo = new Dog(10.0, 5);
		
		//Dog One
		System.out.println("Dog one's weight is: " + dogOne.weight);
		System.out.println("And Dog one ");
		dogOne.run();
		dogOne.selfDisc();
		Animal.story();
		
		System.out.println("\n");
		
		System.out.println("Dog two's weight is: " + dogTwo.weight + " And age is: " + dogTwo.age);
		System.out.println("And Dog two ");
		dogTwo.run();
		dogTwo.selfDisc();
		dogTwo.story();
		
		System.out.println("\n");
		
		Dog dogThree = new Dog(12.2, 2);
		
		//dog Three
		System.out.println("Dog two's weight is: " + dogThree.weight + " And age is: " + dogThree.age);
		System.out.println("And Dog two ");
		dogThree.run();
		dogThree.selfDisc();
		dogThree.story();
		
		System.out.println("\n");
		
		Animal catOne = new Cat(6.3);
		Animal catTwo = new Cat(7.2, 1);
		
		//Cat one
		System.out.println("Cat one's weight is: " + catOne.weight);
		System.out.println("And cat one ");
		catOne.run();
		catOne.selfDisc();
		catOne.story();
		
		System.out.println("\n");
		
		//cat two
		System.out.println("Cat two's weight is: " + catTwo.weight + " And age is: " + catTwo.age);
		System.out.println("And cat two ");
		catTwo.run();
		catTwo.selfDisc();
		catTwo.story();
		
		System.out.println("\n");
		
		//Cat three
		Cat catThree = new Cat(4.6, 2);
		System.out.println("Cat three's weight is: " + catThree.weight + " And age is: " + catThree.age);
		System.out.println("And cat three ");
		catThree.run();
		catThree.selfDisc();
		catThree.story();
	}
}
