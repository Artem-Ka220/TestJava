class TestDriveNewArray{
	public static void main(String[] args){
		MyNewArray myNewArray = new MyNewArray();

		myNewArray.setMax(125);
		myNewArray.setMin(30);

		int[][] myNewSmallArray = myNewArray.createNewArray(6,14);

		myNewArray.generateArray(myNewSmallArray);
		myNewArray.printNewArray(myNewSmallArray);
	}
}