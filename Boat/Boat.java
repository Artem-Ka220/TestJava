public class Boat {
	private int length;
	public void setLength(int len){
		length = len;
	}
	public int getLength(){
		return length;
	}
	public void move(){
		System.out.print("Дрейф ");
	}
public static class SailBoat extends Boat {
	public void move(){
		System.out.print("Поднять паруса!");
		}
	}
public static class RowBoat extends Boat {
		public void rowTheBoat(){
			System.out.println("Давай, Наташа!");
		}
	}
public static class TestBoats{
	public static void main(String[] args){
		Boat b1 = new Boat();
		SailBoat b2 = new SailBoat();
		RowBoat b3 = new RowBoat();

		b2.setLength(32);
		System.out.println(b2.getLength());
		b1.move();
		b3.move();
		b2.move();
		}
	}
}