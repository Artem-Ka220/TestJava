class MyNewArray{

        private int max;
	private	int min;

	public int getMax(){
		return max;
	}

	public void setMax(int num){
		max = num;
	}

	public int getMin(){
		return min;
	}
	public void setMin(int num){
		min = num;
	}

	public int[][] createNewArray(int minNum, int maxNum){
		int[][] newArray = new int[minNum][maxNum];
		return newArray;
	}

	public int [][] generateArray(int [][] anyArray){
		max -= min;
		++max;

	for(int i = 0; i < anyArray.length; i++){
		for(int j = 0; j < anyArray[i].length; j++){
			anyArray[i][j] = (int)(Math.random() * max) + min; 
			}
		}
		return anyArray;
	}

	public void printNewArray(int [][] someArray){
		for(int i = 0; i < someArray.length; i++){
			for(int j = 0; j < someArray[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}
				if(j < someArray[i].length - 1){
					System.out.printf("%3s, ",someArray[i][j]);
				}else{
					System.out.printf("%3s ]",someArray[i][j]);
				}
			}
		System.out.println();
		}
	}
}