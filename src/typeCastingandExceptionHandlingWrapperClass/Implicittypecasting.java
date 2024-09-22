package typeCastingandExceptionHandlingWrapperClass;

public class Implicittypecasting {
	
	
	public static void main(String[] args) {
		byte b=100; // 1 byte
		short s; // 2 bytes
		char a; // 2 bytes
		int i=80; // 4 bytes
		long l; // 8 bytes
		float f; // 4 bytes
		boolean bb; // 1 bit
		double d; // 8 bytes
		
	//	i=b; // Implicit TC: here we're assigning small data datatype(byte) to large data type(int)
		//smaller or equal size dataype value is transferred to equal or bigger size datatype is called Implicit TC
		//System.out.println(i);
		b=(byte) i; // Explicit TC : here we're assigning large datatype(int) to small datatype(byte)
		System.out.println(b);
	}

}
