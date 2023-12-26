import java.util.Arrays;

class ArraySort{
	public static void main(String[] args){
		int[] newArray = new int[15];

		for(int i = 0; i < newArray.length; i++){
			newArray[i] = (int)(Math.random() * 15);
		}

		System.out.println(Arrays.toString(newArray));

		Arrays.sort(newArray);

		System.out.println(Arrays.toString(newArray));
	}
}