import java.util.Arrays;

class CopyArray{
	public static void main(String[] args){
		int [] myArray = new int [18];

		for(int i = 0; i < myArray.length; i++){
			myArray[i] = (int)(Math.random() * 12);
		}

		System.out.println(Arrays.toString(myArray));

		int [] copyArray = new int[myArray.length];

		copyArray = Arrays.copyOf(myArray,myArray.length);

		System.out.println(Arrays.toString(copyArray));
	}
}