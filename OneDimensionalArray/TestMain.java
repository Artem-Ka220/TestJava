class TestMain{
	public static void main(String[] args){
		Main main = new Main();
		int[][] myArray = main.createNewArray(4, 8);
		main.printArray(myArray);

		int[] newArray = main.createOneDimensionalArray(myArray);
		main.printOneDimArray(newArray);
	}
}