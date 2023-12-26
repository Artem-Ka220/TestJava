import java.util.Arrays;

class Copy{
	public static void main(String[] args){
		int[] newArray = {12, 3, -55, 24, 87, 48, 0, 23, 1, -3, 30, 23};
		System.out.println(Arrays.toString(newArray));
		int myNewArray [] = Arrays.copyOfRange(newArray, 2, 8);

		System.out.println(Arrays.toString(myNewArray));
	}
}