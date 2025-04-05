
public class code8 {
public static void main(String[] args) {
	System.out.println("main");
	code8 c1 = new code8();
	code8 c2 = new code8(100);
}
static {
	System.out.println("SIB");
}
{
	System.out.println("IIB");
}
code8(){
	System.out.println("const with no arg");
}
code8(int i){
	System.out.println("const with arg");
}
}
