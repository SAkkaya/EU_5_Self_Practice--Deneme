package day43_polymorphism;

public class TesAnimal {

	public static void main(String[] args) {
		
	Animal a = new Animal();
	Animal b = new Dog();
	Animal c = new Bird();
	
	
	Animal animal = new Animal();
	animal = new Dog();
	animal = new Bird();
	
	
	//parent         //child    ==>sol taraf Parent ya da Interface ; sag taraf child class olmali 
	
	//Bird bx    =   new Dog();     --> her ikisi de child oldugu icin olmaz
	
		

	}

}



class Animal{}


class Dog extends Animal{}


class Bird extends Animal{}


