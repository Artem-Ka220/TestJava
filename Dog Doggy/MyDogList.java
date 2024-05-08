public class MyDogList{
	Dog [] dogs = new Dog[5];
	int nextIndex = 0;

	public void add(Dog d){
		if(nextIndex < dogs.length){
			dogs[nextIndex] = d;
			System.out.println("Dog добавлен в ячейку " + nextIndex);
			nextIndex++;
		}
	}
}