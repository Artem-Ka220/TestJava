class NewArrayCode{
	int[][] createNewArray(int hight, int width){
		int[][] anyArray = new int[hight][width];
			for(int i = 0; i < anyArray.length; i++){
				for(int j = 0; j < anyArray[i].length; j++){
					anyArray[i][j] = (int)(Math.random()* 100);
			}
		}
	return anyArray;
	}
	void printNewArray(int[][] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}
					if(j < anyArray[i].length - 1){
						System.out.printf("%3s, ", anyArray[i][j]);
							}else{
								System.out.printf("%3s ]", anyArray[i][j]);
					}
				}
			System.out.println();
			}
		System.out.println();
		}
	int sum(int[][] someArray){
		int sum = 0;
		for(int i = 0; i < someArray.length; i++){
			for(int j = 0; j < someArray[i].length - i; j++){
				sum+=someArray[i][j];
			}
		}
		return sum;
	}
	int sumDiagonal(int[][] someArray){
		int sumDiagonal = 0;
			for(int i = 0; i < someArray.length; i++){
				for(int j = 0; j < someArray[i].length; j++){
					if(i == j){
						sumDiagonal+=someArray[i][j];
					}
				}
			}
		return sumDiagonal;
		}
}