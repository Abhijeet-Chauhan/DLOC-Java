package march4;
@FunctionalInterface
public interface code3 {
public void sum(int i, int j, int k);
}

class c1{
	public static void main(String[] args) {
		code3 c=(i,j,k)->System.out.println("sum"+(i+j+k));
	}
}