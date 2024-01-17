public class NewPublicArray{
	public int[][] newArray(int size, int width){
		 int [][] array = new int [size][width];
			for(int i = 0; i < array.length; i++){
				for(int j = 0; j < array[i].length; j++){
					array[i][j] = (int)(Math.random() * 100);
			}
		}
	return array;
	}
	public void printArray(int [][] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}if(j < anyArray[i].length - 1){
					System.out.printf("%3s, ", anyArray[i][j]);
				}else{
					System.out.printf("%3s ]", anyArray[i][j]);
				}			
			}
		System.out.println();
		}
		System.out.println();
	}
	public int lineSum(int [][] someArray, int lineNumber){
		int sum = 0;
		for(int i = 0; i < someArray[lineNumber].length; i++){
			sum = sum + someArray[lineNumber][i];
		}
		return sum;
	}
	public void sumEachLine(int [][] someArray){
		int sum = 0;
		for(int i = 0; i < someArray.length; i++){
			for(int j = 0; j < someArray[i].length; j++){
				sum = sum + someArray[i][j];
			}
			System.out.printf("Сумма чисел в строке %s равна %s.", i, sum);
			sum = 0;
			System.out.println();
		}
	}
}