class CopyTestArray{
	public static void main(String[] args){
		int [] copyTestArray = new int [10];

		for(int i = 0; i < copyTestArray.length; i++){
			copyTestArray[i] = (int)(Math.random() * 500);
		}

		printArray(copyTestArray);
		int [] myNewArray = copyArray(copyTestArray);
		printArray(myNewArray);
	}

public static void printArray(int [] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			if(i == 0){
				System.out.print("[ ");
			}
			if(i == anyArray.length - 1){
				System.out.print(anyArray[i] + "]");
			}else{
				System.out.print(anyArray[i] + ", ");
			}
		}
System.out.println();
	}
public static int[] copyArray(int [] anyArray){
	int [] newCopyArray = new int[anyArray.length];
	for(int i = 0; i < anyArray.length; i++){
		newCopyArray[i] = anyArray[i];
}
	return newCopyArray;
	}
}