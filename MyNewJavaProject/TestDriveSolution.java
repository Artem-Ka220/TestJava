class TestDriveSolution{
	public static void main(String[] args){
		Solution solution = new Solution();
		int [][] myArray = solution.createNewArray(5, 5);
		solution.printArray(myArray);
		System.out.print(solution.maxNum(myArray));
	}
}