class Main{
	int [][] createNewArray(int height, int weidth){
		int [][] newArray = new int[height][weidth];
			for(int i = 0; i < newArray.length; i++){
				for(int j = 0; j < newArray[i].length; j++){
					newArray[i][j] = (int)(Math.random()*999);
			}
		}
	return newArray;
	}
	
	void printArray(int[][] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(j == 0){
					System.out.print("[");
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
	}
	int [] createOneDimensionalArray(int anyArray[][]){
		int [] myArray = new int[anyArray.length];
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				myArray[i] += anyArray[i][j];
			}
		}
		return myArray;
	}
	
	void printOneDimArray(int [] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			if(i == 0){
				System.out.print("[ ");
			}
			if(i < anyArray.length - 1){
				System.out.printf("%4s, ", anyArray[i]);
			}else{
				System.out.printf("%4s ]", anyArray[i]);
			}
		}
	}
}