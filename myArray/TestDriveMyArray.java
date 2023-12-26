class TestDriveMyArray{
	public static void main(String[] args){
			MyArray myArray = new MyArray();
				myArray.setSize(15);

				int[][] anyArray = myArray.generateArray(myArray.getSize());
				myArray.printArray(anyArray);
		}
	}