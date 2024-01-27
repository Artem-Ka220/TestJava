class TestDriveSolution{
	public static void main(String[] args){
		Solution sol = new Solution();
		int myNewArray[][] = sol.createNewArray(5, 4);
		sol.printAnyArray(myNewArray);	
		System.out.println(sol.sum(myNewArray));
		System.out.println(sol.sumInterior(myNewArray));

		while(true){
		int [][]myArray = sol.createNewArray(5, 4);

		sol.printAnyArray(myArray);

		int mySum = sol.sum(myArray);
		int mySumTwo = sol.sumInterior(myArray);
		System.out.println(mySum);
		System.out.println(mySumTwo);
		if(mySum == mySumTwo){
		System.out.printf("Сумма %s и %s равны!", mySum, mySumTwo);
			break;
			}
		
		}
		
	}
}