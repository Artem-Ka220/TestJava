import java.util.Calendar;

public class Solution{
	public static void main(String[] args){
		Calendar calendar = Calendar.getInstance();
		calendar.set(2004, 0, 7, 15, 40);
		System.out.println(calendar.get(calendar.YEAR));
		System.out.println("День: " + calendar.get(calendar.DATE));

		long dayOne = calendar.getTimeInMillis();
		dayOne += 1000 * 60 *60;
		calendar.setTimeInMillis(dayOne);
		System.out.println("Новый час: " + calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("День: " + calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("День: " + calendar.get(calendar.DATE));

		calendar.add(calendar.DATE, 35);
		System.out.println("Добавить 35 дней: " + calendar.getTime());

		calendar.roll(calendar.DATE, 35);
		System.out.println("Прокрутить 35 дней: " + calendar.getTime());

		calendar.set(calendar.DATE, 1);
		System.out.println("Установить дату в 1: " + calendar.getTime());
	}
}