class TestDriveMain{
	public static void main(String[] args){
	Main main = new Main();
	
	int[][] myArray = {{6, 89, 340, 2},{5, 800, 31, 900},{23, 193, 314, 4},{1, 3, 5, 7}};

	main.printArray(myArray);
	System.out.printf("The sum of the array myArray is %s.", (main.sumArray(myArray)));
	}
}