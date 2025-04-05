package variables;


public class child extends parent {
	child()
	{
	
super('a');
		
	}
	child(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		child c1 = new child();
	}
}
