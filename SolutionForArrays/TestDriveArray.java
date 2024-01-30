class TestDriveArray{
	public static void main(String[] args){
		Array array = new Array();
		int [][] myArray = array.createArray(8, 9);
		array.printArray(myArray);

		int[] oneNewArray = array.oneDimensionalArray(myArray, 3);
		array.printOneDimensionalArray(oneNewArray);
	}
}