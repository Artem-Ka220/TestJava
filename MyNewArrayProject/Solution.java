class Solution{
	int[][] createArray(int height, int weidth){
		int [][] newArray = new int[height][weidth];
			for(int i = 0; i < newArray.length; i++){
				for(int j = 0; j < newArray[i].length; j++){
					newArray[i][j] = (int)(Math.random()*2000);
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
					System.out.printf("%4s, ", anyArray[i][j]);
				}
				else{
					System.out.printf("%4s ]", anyArray[i][j]);
				}
			}
		System.out.println();
		}
System.out.println();
	}
	void minMax(int [][] anyNumber){
		int max = 0;
			int min = anyNumber[0][0];
				for(int i = 0; i < anyNumber.length; i++){
					for(int j = 0; j < anyNumber[i].length; j++){
						if(max < anyNumber[i][j]){
							max = anyNumber[i][j];
				}
							if(min > anyNumber[i][j]){
							min = anyNumber[i][j];
				}
			}
		}
		int count = 0;
			int countTwo = 0;
				for(int i = 0; i < anyNumber.length; i++){
					for(int j = 0; j < anyNumber[i].length; j++){
						if(max == anyNumber[i][j]){
							count++;
					}
				if(min == anyNumber[i][j]){
			countTwo++;
				}
			}
		}
		System.out.printf("Максимальное число - %3s. Встречается оно в массиве %s раз. \n", max, count);
			System.out.printf("Минимальное число - %3s. Встречается оно в массиве %s раз.", min, countTwo);
	}
}