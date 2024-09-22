package condtionalHandlingandLoops;

public class BreakinJava {
	
	void m2() {
	for (int i = 0; i < 10; i++) {
		  if (i == 4) {
		    break;
		  }
		  System.out.println(i);
		}
	}
	public static void main(String[] args) {
		BreakinJava obj= new BreakinJava();
		obj.m2();
	}
}
