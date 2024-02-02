import java.util.Random;
class Solution{
	int[][] createArray(int height, int width){
	Random rnd = new Random();
		int [][] myArray = new int[height][width];
			for(int i = 0; i < myArray.length; i++){
				for(int j = 0; j < myArray[i].length; j++){
					myArray[i][j] = rnd.nextInt(101);
			}
		}
		return myArray;
	}
	void printArray(int[][] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}
				if(j < anyArray[i].length - 1){
					System.out.printf("%3s, ", anyArray[i][j]);
				}
				else{
					System.out.printf("%3s ]", anyArray[i][j]);
				}
			}
			System.out.println();
		}
	System.out.println();
	}
	void minMax(int[][] someArray){
		int max = someArray[0][0];
		int min = someArray[0][0];
		int placeMinLine = 0;
		int placeMinLineSeries = 0;
		int placeMaxLine = 0;
		int placeMaxLineSeries = 0;
	for(int i = 0; i < someArray.length; i++){
		for(int j = 0; j < someArray[i].length; j++){
			if(max < someArray[i][j]){
				max = someArray[i][j];
				placeMaxLine = i;
				placeMaxLineSeries = j;
				}
				if(min > someArray[i][j]){
				min = someArray[i][j];
				placeMinLine = i;
				placeMinLineSeries = j;
				}
			}
		}
		System.out.printf("Максимальное число - %3s, находится в %3s строке, в %3s ряду.\n", max, placeMaxLine, placeMaxLineSeries);
			System.out.printf("Минимальное число - %3s, находится в %3s строке, в %3s ряду.", min, placeMinLine, placeMinLineSeries);
	}
}