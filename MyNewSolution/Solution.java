class Solution{
	int [][] createNewArray(int height, int width){
		int [][] newArray = new int [height][width];
			for(int i = 0; i < newArray.length; i++){
				for(int j = 0; j < newArray[i].length; j++){
					newArray[i][j] = (int)(Math.random() * 100);
			}
		}
		return newArray;
	}

	void printAnyArray(int [][] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}
				if(j < anyArray[i].length - 1){
					System.out.printf("%2s, ", anyArray[i][j]);
				}
				else{
					System.out.printf("%2s ]", anyArray[i][j]);
				}
			}
		System.out.println();
		}
		System.out.println();
	}

	int sum(int [][] anyArray){
		int sum = 0;
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(i == 0 || i == anyArray.length - 1 || j == 0 || j == anyArray[i].length - 1){
					sum = sum + anyArray[i][j];
				}
			}
		}
		return sum;
	}

	int sumInterior(int anyArray[][]){
		int sum = 0;
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(i > 0 && i < anyArray.length - 1 && j > 0 && j < anyArray[i].length - 1){
					sum = sum + anyArray[i][j];
				}
			}
		}
		return sum;
	}
}