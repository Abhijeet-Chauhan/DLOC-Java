package feb21;
// var-arg 
public class array3 {
public static void add(int...x) {
	int count = 0;
//	for each loop
	for(int a:x) {
		
		count = count +a;
	}
	System.out.println("sum: "+count);
}

//public static void add(int i, int j, int k) {
//	System.out.println(i+j+k);
//}
public static void main(String[] args) {
	add(12,23);
	add(11,22,33,44);
}
}
