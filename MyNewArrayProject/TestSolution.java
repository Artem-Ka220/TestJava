class TestSolution{
	public static void main(String[] args){
		Solution solution = new Solution();
		int[][] newArray = solution.createArray(7, 7);
		solution.printArray(newArray);
		solution.minMax(newArray);
	}
}