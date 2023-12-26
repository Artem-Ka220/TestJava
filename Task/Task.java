public class Task{
	private int x;

	public int getX(){
		return x;
	}

	public void setX(int number){
		x = number;
	}

	public int [][] newArray(int anyNumber, int [][] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(anyArray[i][j] != anyNumber){
					anyArray[i][j] = 0;
				}
			}
		}
		return anyArray;
	}
	public void printArray(int[][] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}
				if(j < array[i].length - 1){
					System.out.printf("%2s, ", array[i][j]);
				}else{
					System.out.printf("%2s ]", array[i][j]);	
				}
			}
		System.out.println();
		}
		System.out.println();
	}
}