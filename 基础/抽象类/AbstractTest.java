

abstract class Fruit {
	int qty;
	String name;

	//abstract void buy();
	void buy(){
		System.out.println("Fruit not abstract");
	}
}

class Apple extends Fruit{
	//Fruit fruit = new Fruit();
	void buy(){
		System.out.println("buy apple");
	}
}

class AbstractTest{
	public static void main(String[] args){
		System.out.println("test");
		Apple app = new Apple();
		app.qty = 10;
		System.out.println(app.qty);
		app.buy();
	}
}