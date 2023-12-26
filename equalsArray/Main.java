import java.util.Arrays;

class Main{
	public static void main(String[] args){
		int[] array = new int[14];
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() * 13);
		}
		System.out.println(Arrays.toString(array));

		int[] newArray = new int[14];
		for(int i = 0; i < newArray.length; i++){
			newArray[i] = (int)(Math.random() * 13);
		}
		System.out.println(Arrays.toString(newArray));

		System.out.println(Arrays.equals(array, newArray));

		int[] anyArray = {1, 3, 5};

		int[] someArray = {1, 3, 5};

		System.out.println(Arrays.equals(anyArray, someArray));
	}
}