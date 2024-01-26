class TestDriveArrayTask{
	public static void main(String[] args){
		NewArrayTask newArrayTask = new NewArrayTask();
		int[][] myArray = newArrayTask.newArray(5, 15);
		newArrayTask.printArray(myArray);
		
		System.out.println(newArrayTask.columnSum(myArray, 3));

		newArrayTask.columnsMaxSum(myArray);
	}
}