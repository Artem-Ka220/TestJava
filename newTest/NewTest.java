class NewTest{
	public static void main(String[] args){
		int max = 125;
		int min = 30;

		max -= min;

	int [][] array = new int [8][8];

		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = (int)(Math.random() * ++max) + min;
			}
		}

		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				System.out.print(array[i][j] + ", ");
			}
		System.out.println();
		}
	}
}