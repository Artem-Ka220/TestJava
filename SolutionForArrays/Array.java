class Array{
	int [][]createArray(int height, int weidth){
		int[][] newArray = new int[height][weidth];
			for(int i = 0; i < newArray.length; i++){
				for(int j = 0; j < newArray[i].length; j++){
					newArray[i][j] = (int)(Math.random()*201);
			}
		}
		return newArray;
	}
	void printArray(int[][] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}
				if(j < array[i].length - 1){
					System.out.printf("%3s, ", array[i][j]);
				}
				else{
					System.out.printf("%3s ]", array[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	int[] oneDimensionalArray(int[][] anyArray, int numberLine){
		int count = 0;
		for(int i = 0; i < anyArray[numberLine].length; i++){
			if(anyArray[numberLine][i] % 2 == 0){
				count++;
			}
		}
		int[] myArray = new int[count];
		int newCount = 0;
		for(int i = 0; i < anyArray[numberLine].length; i++){
			if(anyArray[numberLine][i] % 2 == 0){
				myArray [newCount] = anyArray[numberLine][i];
				newCount++;
			}
		}
		return myArray;
	}
	void printOneDimensionalArray(int[] array){
		for(int i = 0; i < array.length; i++){
			if(i == 0){
				System.out.print("[ ");
			}
			if(i < array.length - 1){
				System.out.printf("%3s, ", array[i]);
			}
			else{
				System.out.printf("%3s ]", array[i]);
			}
		}
		System.out.println();
	}
}