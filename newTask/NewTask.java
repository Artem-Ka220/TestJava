class NewTask{
	int [][] newArray = {{3,1,4,2},{-2,7,5,1},{8,0,6,8},{9,-4,-8,10}};

	public void sum(int [][] anyArray){
		int sum = 0;
			for(int i = 0; i < anyArray.length; i++){
				for(int j = anyArray[i].length - 1; j > 0; j--){
				sum = sum + anyArray[i][i] + anyArray[i][j];
			}
			System.out.println(sum);
		}
	if(sum == 0){
		System.out.println("Yes!");
		}else{
			System.out.println("No!");
		}
	}
}