public class TestFormat{
	public static void main(String[]args){
		String s = String.format("%, d", 1000000000);
		System.out.println(s);
		String c = String.format("Мне нужно исправить %,.2f, ошибки",476578.09876);
		System.out.println(c);
	}
}