class DVDPlayer{
	boolean canRecord = false;

	void recordDVD(){
	  System.out.println("идёт запись DVD");
	}

	void playDVD(){
	  System.out.println("проигрываю кино");
	}
}
class DVDPlayerTestDrive{
	public static void main(String[] args){
		DVDPlayer dvd = new DVDPlayer();

		dvd.canRecord = true;

		dvd.playDVD();
		if(dvd.canRecord == true){
		  dvd.recordDVD();
			}
		}
	}
