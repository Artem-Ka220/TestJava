class TestCatDrive{
	public static void main(String[] args){
		Cat cat = new Cat();
		cat.name = "Мурка.";
		cat.size = 40;

		System.out.println("Кошка по имени - " + cat.name);
		System.out.println("Размером - " + cat.size + ".");
		System.out.print("Говорит: ");
		cat.voice();	
	}
}