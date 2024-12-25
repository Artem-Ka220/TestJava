public class TestPlayer{
	public static void main(String[] args){
		System.out.println(Player.playerCount);
		Player player = new Player("Вуди Харрельсон");
		System.out.println(Player.playerCount);
		Player playerOne = new Player("Джеси Айзенберг");
		System.out.println(Player.playerCount);
	}
}