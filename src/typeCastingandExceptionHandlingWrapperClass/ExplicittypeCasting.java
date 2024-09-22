package typeCastingandExceptionHandlingWrapperClass;

public class ExplicittypeCasting {
	public static void main(String[] args) {
		byte b=100; // 1 byte
		short s; // 2 bytes
		char a; // 2 bytes
		int i=80; // 4 bytes
		long l; // 8 bytes
		
		b=(byte) i; // Explicit TC : here we're assigning large datatype(int) to small datatype(byte)
		System.out.println(b);
	}

}
