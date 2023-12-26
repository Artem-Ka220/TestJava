public class MyArray{
	private int anyNumber;

	public int getAnyNumber(){
		return anyNumber;
	}

	public void setAnyNumber(int anyNumber){
		if(anyNumber % 2 != 0){
			this.anyNumber = anyNumber;
	}else{
		System.out.print("Число должно быть нечётным.");
	}
}
	
	public int[][] PRArray(int someArray){
		int[][] arrays = new int[someArray][someArray];
			for(int i = 0; i < arrays.length; i++){
				for(int j = 0; j < arrays.length; j++){
					arrays[i][j] = (int)(Math.random() * 15);
				}
		}
		return arrays;
}


	public void printArray(int [][] someArray){
		for(int i = 0; i < someArray.length; i++){
			for(int j = 0; j < someArray[i].length; j++){
				if(j == 0){
					System.out.print("[ ");
				     }
					if(j < someArray[i].length - 1){
						System.out.printf("%2s, ", someArray[i][j]);
					}else {
							System.out.printf("%2s ]", someArray[i][j]);
						}
			}
			System.out.println();
		}
	}
	public void centralArray(int [][] anyArray){
			System.out.println("Крайнее левое число равно " + anyArray[0][0]);
				System.out.println("Крайнее левое(нижнее) число равно " + anyArray[anyArray.length - 1][0]);
					System.out.println("Крайнее правое число равно " + anyArray[0][anyArray.length - 1]);
						System.out.println("Крайнее правое(нижнее) число равно " + anyArray[anyArray.length - 1][anyArray.length - 1]);
							System.out.println("Число в середине массива равно " + anyArray[(anyArray.length - 1) / 2][(anyArray.length - 1) / 2]);
			if(anyArray[0][0] == anyArray[anyArray.length - 1][0]){
				if(anyArray[anyArray.length - 1][0] == anyArray[0][anyArray.length - 1]){
					if(anyArray[0][anyArray.length - 1] == anyArray[anyArray.length - 1][anyArray.length - 1]){
						if(anyArray[anyArray.length - 1][anyArray.length - 1] == anyArray[(anyArray.length - 1) / 2][(anyArray.length - 1) / 2]){
							System.out.println("Массив является центральным.");
					}else{
								System.out.println("Массив не является центральным.");
					}
				}
			}else{
				System.out.println("Массив не является центральным.");
				}
		}else{
			System.out.println("Массив не является центральным.");
		}	
			System.out.println();	
	}
}