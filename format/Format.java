import java.util.Date;
public class Format{
	public static void main(String[]args){
		System.out.printf("Distance %,6.1f\n",42.000);
		System.out.printf("Уровень %,d,%,d,%,d из %,d,%,d,%,.2f\n", 20,456,654,100,567,890.24);

		int one = 20456654;
	double two = 100567890.248907;

	String s = String.format("\"Уровень %,d из %,.2f\"\n", one, two);
	System.out.print(s);

	System.out.printf("%tc\n",new Date());
	System.out.printf("%tr\n",new Date());

	Date today = new Date();
	System.out.printf("Сегодня %tA, %td %tB\n", today, today, today);

	System.out.printf("Сегодня %tA, %<td %<tB.\n", today);
	}
}