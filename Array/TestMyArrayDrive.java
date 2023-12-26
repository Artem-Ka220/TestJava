class TestMyArrayDrive{
	public static void main(String[] args){
	
	MyArray myArray = new MyArray();
	myArray.setAnyNumber(15);

	System.out.println("Размер - " + myArray.getAnyNumber());

	int number = myArray.getAnyNumber();

        int [][] newMyArray = myArray.PRArray(number);

	myArray.printArray(newMyArray);

	myArray.centralArray(newMyArray);

	int[][] myOwnArray = {{15,4,3,3,15},{15,3,1,15,15},{15,3,15,3,15},{15,9,3,1,15},{15,0,2,6,15}};

	myArray.centralArray(myOwnArray);
	}
}