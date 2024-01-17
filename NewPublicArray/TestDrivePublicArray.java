public class TestDrivePublicArray{
	public static void main(String[] args){
		NewPublicArray newPublicArray = new NewPublicArray();
		int[][] myArray = newPublicArray.newArray(5,5);

		newPublicArray.printArray(myArray);

		int anySum = newPublicArray.lineSum(myArray, 2);
		System.out.print(anySum);
		System.out.println();
		newPublicArray.sumEachLine(myArray);
	}
}