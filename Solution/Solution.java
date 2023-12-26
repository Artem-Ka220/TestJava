import java.util.Arrays;

class Solution{
	public static void main(String[] args){
		int[][] array = {{42, 8, 12},{74,156, 23}, {34, 12, 98}};
		System.out.println(Arrays.deepToString(array));
		int[][] newArray = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.deepToString(newArray));
		System.out.println("Одинаковые ли это массивы?");
		System.out.println(Arrays.deepEquals(array, newArray));
	}
}