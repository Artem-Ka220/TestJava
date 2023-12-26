class Dog{
	int size;
	String breed;
	String name;
void bark(){
	System.out.print("Гав! Гав! Гав!");
	}
}

class TestDogDrive{
	public static void main(String[] args){
	Dog dog = new Dog();
	dog.size = 40;
	dog.bark();
	}
}