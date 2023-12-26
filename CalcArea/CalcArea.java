class CalcArea{
	public static void main(String[] area){
		int a = calcArea(7,12);
		short c = 7;

		System.out.println(a);
		System.out.println(calcArea(c, 15));

		int i = 3;
		int t = 3;

		byte b = 3;
		double z = 3; 

		System.out.println("z = " + z);

		System.out.println(i == t);
		System.out.println(i == b);
		System.out.println(b == z);
		System.out.println(z == t);
		
	}
	static int calcArea(int height, int width){
		return height * width;
	}
}