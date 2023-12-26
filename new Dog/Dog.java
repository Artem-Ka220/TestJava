class Dog{
String name;
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.name = "Барт";

		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog;

		myDogs[0].name = "Фред";
		myDogs[1].name = "Джордж";

		System.out.print("Кличка последней собаки - ");
		System.out.println(myDogs[2].name);

		int x = 0;

		while(x < myDogs.length){
			myDogs[x].bark();
			x++;
		}
	}
public void bark(){
	System.out.println(name + " сказал Гав!");
	}
public void eat(){}
public void chaseCat(){}
}