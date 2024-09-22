package javaprograms;

import oops.UpcastingA;

public class Constructorandsuper extends Constructorr{

	
public Constructorandsuper(){
		
		System.out.println("child default");
	}
	
	public Constructorandsuper(String a) {
		
		System.out.println("child one param constructor");
	}

	public Constructorandsuper(String a, int b) {
		System.out.println(" child two param constructor");
	}
	
	public static void main(String[] args) {
		Constructorandsuper ob=new Constructorandsuper();
		
		//Staticmethodsandvar.ds();
	}
}
