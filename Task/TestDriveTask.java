class TestDriveTask{
	public static void main(String[] args){
		Task task = new Task();
		task.setX(33);

		int myNumber = task.getX();
		int[][] myArray = {{2, 33, 5, 7}, {0, 9, 38, 1}, {9,33, 33, 33}};

		task.printArray(myArray);

		int[][] myNewArray = task.newArray(myNumber, myArray);
		task.printArray(myNewArray);
	}
}