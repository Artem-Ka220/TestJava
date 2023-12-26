class Main{
	public static void main(String[] args){
		int numbers[] = {45, 897, 14, 25, 68, -1, -78, 0, -42, - 3, 4000};
		for(int i = numbers.length - 1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(numbers[j] > numbers[j + 1]){
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

	for(int i = 0; i < numbers.length; i++){
		if(i == 0){
			System.out.print("[ ");
		}
		if(i == numbers.length - 1){
			System.out.print(numbers[i] + " ]");
		}else{
			System.out.print(numbers[i] + ", ");
		}
		}
	}
}