class TestDriveNewArrayCode{
	public static void main(String[] args){
		NewArrayCode newArrayCode = new NewArrayCode();
			int [][] myArray = newArrayCode.createNewArray(7, 7);
				newArrayCode.printNewArray(myArray);
					System.out.print(newArrayCode.sum(myArray));
						System.out.println();
							System.out.println(newArrayCode.sumDiagonal(myArray));
	}
}