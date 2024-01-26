class NewArrayTask{
	int columnSum(int [][] anyArray, int anyColumn){
		int sum = 0;
			for(int j = 0; j < anyArray.length; j++){
				sum = sum + anyArray[j][anyColumn];
			}
		return sum;
	}

	void columnsMaxSum(int anyArray[][]){
		int max = 0;
		int sum = 0;
		for(int i = anyArray[0].length - 1; i >= 0; i--){
			for(int j = 0; j < anyArray.length; j++){
				sum = sum + anyArray[j][i];
			}
				System.out.printf("Сумма %s колонки равна %s.", i, sum);
					System.out.println();
						if(max < sum){
							max = sum;
				}
			sum = 0;
		}
		System.out.printf("Максимальная сумма равна %s.", max);
	}

	int [][] newArray(int size, int width){
		int [][] myNewArray = new int[size][width];
			for(int i = 0; i < myNewArray.length; i++){
				for(int j = 0; j < myNewArray[i].length; j++){
					myNewArray[i][j] = (int)(Math.random() * 89);
			}
		}
		return myNewArray;
	}
	void printArray(int [][] someArray){
		for(int i = 0; i < someArray.length; i++){
			for(int j = 0; j < someArray[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}if(j < someArray[i].length - 1){
					System.out.printf("%2s, ", someArray[i][j]);
				}else{
					System.out.printf("%2s ]", someArray[i][j]);
				}
			}
		System.out.println();
		}
	System.out.println();
	}
}