public class Main{
	public static void main(String[] args){
		int i = 228;
		System.out.println(i);

		Integer iWrap = new Integer(i);
		System.out.println(iWrap);


		int unWrapped = iWrap.intValue();
		System.out.println(unWrapped);
	}
}