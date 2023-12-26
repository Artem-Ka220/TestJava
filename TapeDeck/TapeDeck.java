class TapeDeck{
	boolean canRecord = false;

	void playTape(){
	  System.out.println("пленка проигрывается");
	}
	
	void recordTape(){
	  System.out.println("идёт запись на пленку");	
	}
}
class TapeDeckTestDrive{
	public static void main(String[] args){
		TapeDeck tapeDeck = new TapeDeck();
			tapeDeck.canRecord = true;
			tapeDeck.playTape();

			if(tapeDeck.canRecord == true){
				tapeDeck.recordTape();
			}
		}
	}