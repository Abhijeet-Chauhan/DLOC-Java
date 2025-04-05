package feb21;

public class arra4 {
public static void prod(int...x) {
	int count = 1;
//	for each loop
	for(int a:x) {
		
		count = count *a;
	}
	System.out.println("prod: "+count);
}

//public static void add(int i, int j, int k) {
//	System.out.println(i+j+k);
//}
public static void main(String[] args) {
	prod(12,23);
	prod(11,22,33,44);
}
}
