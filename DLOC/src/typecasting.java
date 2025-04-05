
public class typecasting {
 public static void main(String [] args) {
	 byte a = 100;
	 short s = a;
	 long l = s;
//	 s = l; error type mismatch
	 s = (short)l; //explicit downcasting
	 int i = s;
	 long b = 2345;
	 float f = b; //exception 
	 char c = 'a';
	 i = c; // ascii
}
}