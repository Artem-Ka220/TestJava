class NewIntArea{
	public static void main(String[] area){
		int anyNum = 39;

		int myArray [][] = {{8, 3, 2, 5},{1, 8, 2, 8},{8, 0, 3, 1}, {3, 88, 3, 13}, {23, 8, 28, 39}};

		System.out.println(quantity(anyNum, myArray));

	}
	static int quantity(int num, int [][] anyArray){
		int count = 0;
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(anyArray[i][j] == num){
					count++;
				}
			}
		}
	return count;
	}
}