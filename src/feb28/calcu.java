package feb28;

abstract public class calcu {
abstract public void sum(int i,int j, int k);
abstract public void diff(int i,int j);
abstract public void prod(int i,int j,int k);
abstract public void div(int i,int j);
public static void main(String[] args) {
	division d = new division();
	d.sum(1,20, 40);
	d.diff(2, 1);
	d.prod(2, 3, 55);
	d.div(10, 2);
}
}

abstract class addition extends calcu{
	public void sum(int i, int j,int k) {
		System.out.println(i+j+k);
	}
}

abstract class difference extends addition{
	public void diff(int i, int j) {
		System.out.println(i-j);
	}
}

abstract class product extends difference{
	public void prod(int i, int j,int k) {
		System.out.println(i*j*k);
	}
}

class division extends product{
	public void div(int i, int j) {
		System.out.println("division:"+(i/j));
	}
}

