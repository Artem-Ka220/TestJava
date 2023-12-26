class NewSolution{
	public static void main(String[] args){
		int [][] newArray = new int [9][9];
		printArray(generateNewArray(newArray));

		int [][] someNewArray = {{1,2,3,4},{9,8,7,6},{0,8,6,4},{3,2,1,4}};
		printArray(someNewArray);
		printArray(createNewArray(someNewArray));
	}
	
	public static int[][] generateNewArray(int [][] anyArray){
		int min = 10;
		int max = 99;
		for(int i = 0; i < anyArray.length; i++){
			int any = (int) (Math.random() * (max - min + 1)) + min;
			for(int j = 0; j < anyArray[i].length; j++){
				anyArray[i][j] = any;
			}
		}
		return anyArray;
	}

	public static void printArray(int [][] someArray){
		for(int i = 0; i < someArray.length; i++){
			for(int j = 0; j < someArray[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}
				if(j < someArray.length - 1){
					System.out.printf("%2s, ", someArray[i][j]);
				}else{
					System.out.printf("%2s ]", someArray[i][j]);
				}
			}
		System.out.println();
		}
		System.out.println();
	}

	public static int [][] createNewArray(int [][] someNewArray){
		int [][] newArray = new int[someNewArray.length][someNewArray.length];
		for(int i = 0; i < someNewArray.length; i++){
			for(int j = 0; j < someNewArray[i].length; j++){
				newArray[j][i] = someNewArray[i][j];
			}
		}
		return newArray;
	}
}