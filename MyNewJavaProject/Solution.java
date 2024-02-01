class Solution{
	int[][] createNewArray(int hight, int width){
		int [][] newArray = new int [hight][width];
			for(int i = 0; i < newArray.length; i++){
				for(int j = 0; j < newArray[i].length; j++){
					newArray[i][j] = (int)(Math.random() * 1000);
			}
		}
		return newArray;
	}
	void printArray(int [][] anyArray){
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

	int maxNum(int[][] anyArray){
		int maxNum = 0;
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(anyArray[i][j] > maxNum){
					maxNum = anyArray[i][j];
				}
			}
		}
		return maxNum;
	}
}