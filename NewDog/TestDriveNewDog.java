class TestDriveNewDog{
	public static void main(String[] args){
		NewDog dogOne = new NewDog();
		dogOne.setSize(70);

		NewDog dogTwo = new NewDog();
		dogTwo.setSize(8);

		NewDog dogThree = new NewDog();
		dogThree.setSize(24);

		System.out.printf("Первая собака: %s.\n", dogOne.getSize());
		System.out.printf("Вторая собака: %s.\n", dogTwo.getSize());
		System.out.printf("Третья собака: %s.\n", dogThree.getSize());
	
		dogOne.bark();
		dogTwo.bark();
		dogThree.bark();
	}
}