class RandomDigital{
	public static void main(String[] args){
		
	final int min = 10; 
	final int max = 75; 
	
	
	int count = 0;
	while(count < 16){
	
	System.out.println("Псевдослучайное целое число: " + rnd(min, max));
	count++;
	}
	}

	public static int rnd(int min, int max){
	max -= min;
	return (int) (Math.random() * ++max) + min;

	}
}