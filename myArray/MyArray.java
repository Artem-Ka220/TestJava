class MyArray{
	private int size;

	public int getSize(){
		return size;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int[][] generateArray(int num){
		int[][] newArray = new int [num][num];

		for(int i = 0; i < newArray.length; i++){
			for(int j = 0; j < newArray[i].length; j++){
				newArray[i][j] = (int)(Math.random() * num);
			}
		}
		return newArray;
	}

	public void printArray(int [][] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				}
					if(j < anyArray.length - 1){
						System.out.printf("%2s, ",anyArray[i][j]);
				}else{
							System.out.printf("%2s ]", anyArray[i][j]);
				}
			}
			System.out.println();
		}
	}
}