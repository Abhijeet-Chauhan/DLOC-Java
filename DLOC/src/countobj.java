
public class countobj {
	static int count=0;
//	iib anonyomous (will be execued for every obj creation), irresprective of constructor exe
	{
		count++;
	}
	
	countobj(){
		
	}
	
	countobj(String s){
		
	}
	
	countobj(int i){
		
		
	}
public static void main(String[] args) {
	countobj a = new countobj();
	countobj b = new countobj("abc");
	countobj c = new countobj(3);
	countobj d = new countobj("dcs");
	System.out.println(count);
	
}
}
