class Vehicle{
	int maxSpeed = 120;

	Vehicle(){
		System.out.println("Vehicle Constructor");
	}

	void display(){
		System.out.println("I am from vehicle display");
	}
}

class Car extends Vehicle{
	int maxSpeed = 180;
	
	Car(){
		super();
		System.out.println("Car constructor");
	}

	void display(){
		System.out.println("Maximum speed: " + super.maxSpeed);
	}

	void work(){
		display();
		super.display();
	}
}


class SuperKeyword{
	public static void main(String args[]){
		Car small = new Car();
		small.work();
	}
}
