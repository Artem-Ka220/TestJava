public class TestDogDrive {
	public static void main(String[] args){
		Dog dog = new Dog();
		Dog dogOne = new Dog();
		Dog dogTwo = new Dog();
		Dog dogThree = new Dog();
		Dog dogFour = new Dog();
		Dog dogFive = new Dog();
		Dog dogSix = new Dog();

		MyDogList doggy = new MyDogList();
		doggy.add(dog);
		doggy.add(dogOne);
		doggy.add(dogTwo);
		doggy.add(dogThree);
		doggy.add(dogFour);
		doggy.add(dogFive);
		doggy.add(dogSix);

		for(int i = 0; i < doggy.dogs.length; i++){
			System.out.println(doggy.dogs[i]);
		}
	}
}