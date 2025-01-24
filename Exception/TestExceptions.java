class TestExceptions{
	public static void main(String[] args){
		String test  = "Да";

		try{
			System.out.println("Начало try");
			doRisky(test);
			System.out.println("Конец try");
		}catch(ScaryException se) {
			se.getNewMessage();
		}finally{
			System.out.println("finaly");
		}
		System.out.println("Конец main");
	 }
static void doRisky(String test) throws ScaryException{
		System.out.println("Начало опасного метода...");
		if("Да".equals(test)){
			throw new ScaryException();
		}
		System.out.println("Конец опасного метода.");
		return;
	}
static class ScaryException extends Exception{
        static void getNewMessage(){
                        System.out.println("Жуткое исключение,!");
                }
        }
}