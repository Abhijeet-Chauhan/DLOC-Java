package feb22;
//abstract-without any implementation
//non abstract(concrete) - with implementation
abstract public class gmail {

public void login() {
	System.out.println("login imple");
}
abstract public void inbox();
abstract public void compose();
public static void main(String[] args) {
//	gmail g1 = new gmail(); //cannot instantiate (object creation) abstract class
}
}
