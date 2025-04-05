package march4;
//withut lamda
public interface code2 {
public void sum(int i, int j, int k);
}

class c1 implements code2{
	public void sum(int i, int j, int k){
		System.out.println(i+j+k);
	}
public static void main(String[] args) {
	c1 c  = new c1();
	c.sum(1, 2, 3);
}
}