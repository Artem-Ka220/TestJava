class M {
	public static void main(String[] args){
		int [][] m = {{0,0,0,2},{0,0,2,1},{0,2,1,1},{2,1,1,1}};

		printArray(m);

		one(m);

		int[][] newArray = one(m);
		System.out.println();
		printArray(newArray);
	}

	static void printArray(int [][] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				if(j == 0){
				System.out.print("[ ");
				}
					if(j < anyArray[i].length - 1){
						System.out.printf("%2s, ", anyArray[i][j]);
				}else{
						System.out.printf("%2s ]", anyArray[i][j]);
				}
			}
						System.out.println();
		}
	}

	static int[][] one(int [][] someArray){
		int [][] anyArray = new int[someArray.length][someArray.length];
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray.length; j++){
				anyArray[i][j] = someArray[(someArray.length - 1) - i][(someArray.length - 1) - j];
			}
		}
	//	for(int i = 0; i < someArray.length / 2; i++){
	//		for(int j = 0; j < someArray[i].length; j++){
	//			someArray[i][j] = someArray[(someArray.length - 1) - i][(someArray.length - 1) - j];
	//			someArray[(someArray.length - 1) - i][(someArray.length - 1) - j] = someArray[i][j];
	//		}
	//	}
	return anyArray;
	}
}