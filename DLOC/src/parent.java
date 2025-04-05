
public class parent {
	parent(){
		this('a');
		System.out.println("parent class cons");
	}
	parent(char ch){
		System.out.println("parent class cons with char");
	}
	public static void main(String[] args) {
		System.out.println("main class");
		parent p1 = new parent();
	}
}
