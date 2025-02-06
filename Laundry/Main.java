public class Main{
	public static void main(String[] args){
		String nameOfClothes = "Рубашка";

	try{
		System.out.println("Запускаю стирку...");
			doWashing(nameOfClothes);
		System.out.println("Заканчиваю стирку...");
	    }catch(DressShirtException ce){
		ce.newGetMessageDressShirt();
		}
	    finally{
	        System.out.println("Выключаю стиральную машину.");
		}
	}

	public static void doWashing(String clothes)throws DressShirtException{
			if("Рубашка".equals(clothes)){
				throw new DressShirtException();	
		}
	}	

public static class ClothingException extends Exception{
		public static void newGetMessageClothing(){
			System.out.println("Стирать-то и нечего(: (: (:!!!");
		}
	}

public static class PantsException extends ClothingException{
	
	public static void newGetMessagePants(){
			System.out.println("Режим не соответсвует выбранной одежде!!!");
		}
	}

public static class LingerieException extends ClothingException{
	
	public static void newGetMessageLingerie(){
			System.out.println("Установите соответствующий режим!!!");
		}
	}

public static class ShirtException extends ClothingException{
	
	public static void newGetMessageShirt(){
			System.out.println("Поменяйте режим!!!");
		}
	}

public static class TeeShirtException extends ShirtException{
	
	public static void newGetMessageTeeShirt(){
			System.out.println("Выберите мягкий режим!!!");
		}
	}
public static class DressShirtException extends ShirtException{
	
	public static void newGetMessageDressShirt(){
			System.out.println("Нужен ещё мягче режим!!!");
		}
	}
}