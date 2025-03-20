
public class child extends parent {
	child()
	{
		this(11);
//		super('a');
		
	}
	child(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		child c1 = new child();
	}
}
