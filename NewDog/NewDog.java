class NewDog{
	private int size;

	public int getSize(){
		return size;
	}

	public void setSize(int s){
		size = s;
	}

	public void bark(){
		if(size > 60){
			System.out.println("Гав, гав, гав!");
		}else if(size > 14){
			System.out.println("Вуф, вуф, вуф!");
		}else{
			System.out.println("Тяф, тяф, тяф!");
		}
	}
}