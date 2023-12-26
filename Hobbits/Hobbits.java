class Hobbits{
	String name;
		public static void main(String[] args){
			Hobbits hobbits [] = new Hobbits[3];
			   int x = 0;
				while(x < 3){
					hobbits[x] = new Hobbits();
					hobbits[x].name = "Бильбо";
			   if(x == 1){
				hobbits[x].name = "Фродо";
			}
			   if(x == 2){
				hobbits[x].name = "Сэм";
			}
			System.out.print(hobbits[x].name + "-");
		System.out.println("имя хорошего хоббита.");
		x++;
		}
	}
}