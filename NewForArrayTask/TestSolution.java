class TestSolution{
	public static void main(String[] args){
		Solution solution = new Solution();
		int [][] newArray = solution.createArray(8, 8);

		solution.printArray(newArray);
		solution.minMax(newArray);
	}
}