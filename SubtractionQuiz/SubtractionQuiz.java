import java.util.Scanner;
public class SubtractionQuiz{
	public static void main(String[] args){

	int oneNum = (int)(Math.random() * 10);
	int twoNum = (int)(Math.random() * 10);

	System.out.println(oneNum);
	System.out.println(twoNum);

	if(oneNum < twoNum){
		int temp = oneNum;
		oneNum = twoNum;
		twoNum = temp;
	    }

	System.out.println("Сколько будет " + oneNum + "-" + twoNum + "?");

	Scanner scanner = new Scanner(System.in);
	int yourAnswer = scanner.nextInt();

	if(yourAnswer == oneNum - twoNum){
	System.out.println("Всё верно!");
	}else{
	System.out.println("Неправильно, верный ответ - " + (oneNum - twoNum) + "!");
	}
	}
}