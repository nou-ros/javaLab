abstract class Pizza{
	abstract void eat();
}

class Polygon{
	public void display(){
		System.out.println("Inside the polygon class");
	}
}

interface Rectangle{
	public abstract void draw();
}


class AnonymousClass{
	public static void main(String args[]){
		// anonymous class/inner-class with abstract class
		Pizza p = new Pizza(){
			@Override
			void eat(){
				System.out.println("Anonymous class with abstract class");
			}
		};
		p.eat();
		
		//with normal class
		Polygon pg = new Polygon(){
			@Override
			public void display(){
				System.out.println("Annonymous class with normal class");
			}
		};
		pg.display();
		
		// with interface 
		Rectangle r = new Rectangle(){
			public void draw(){
				System.out.println("Anonymous class with interface");
			}
		};
		r.draw();
	}
}




