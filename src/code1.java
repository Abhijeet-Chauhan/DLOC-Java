
public class code1 {
public static void main(String[] args) {
	int n1 = 100;
	int n2 = 300;
	
	System.out.println(add(n1,n2));
	sub(n1,n2);
	System.out.println(mul(n1,n2));
	System.out.println(div(n1,n2));
}
public static int add(int n1, int n2) {
	return n1+n2;
}

public static void sub(int n1, int n2) {
	System.out.println(n1-n2);
}

public static int mul(int n1, int n2) {
	return n1*n2;
}

public static float div(float n1, float n2) {
	return n1/n2;
}
}
