public class TestBox{
	Integer i = 5;
	int j;

public static void main(String [] args){
	TestBox testBox = new TestBox();
	testBox.go();
	}

public void go(){
	j = i;
	System.out.println(j);
	System.out.println(i);
	boolean b = new Boolean("true").booleanValue();
	System.out.println(b);
	}
}