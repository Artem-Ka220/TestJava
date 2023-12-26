public class Main{
	public void printArray(int [][] someArray){
		for(int i = 0; i < someArray.length; i++){
			for(int j = 0; j < someArray[i].length; j++){
				if(j == 0){
					System.out.print("[");
				}
				if(j < someArray[i].length - 1){
					System.out.printf("%3s, ", someArray[i][j]);
				}else{
					System.out.printf("%3s ]", someArray[i][j]);
				}
			}
		System.out.println();
		}
		System.out.println();
	}

	public int sumArray(int [][] someArray){
		int sum = 0;
		for(int i = 0; i < someArray.length; i++){
			for(int j = 0; j < someArray[i].length; j++){
				sum = sum + someArray[i][j];
			}
		}
		return sum;
	}
}