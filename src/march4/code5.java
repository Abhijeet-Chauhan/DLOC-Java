package march4;
@FunctionalInterface
public interface code5 {
	public void squareIT(int i);
}

class H5 implements code5{
	public void squareIT(int i){
		System.out.println(i*i);
	}
public static void main(String[] args) {
	H5 h  = new H5();
	h.squareIT(3);
}
}