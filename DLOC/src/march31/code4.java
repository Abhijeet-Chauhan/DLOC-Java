package march31;
@FuntionalInterface
interface i5{
	public int add(int i, int j);
}

interface i6 extends i5{
	
}

public class code4 {
public static void main(String[] args) {
	i3 i=(x,y)->{
		return x+y;
	};
	int s = i.add(12, 13);
	//type inference which automatically take dtype in runtime
	System.out.println(s);
}
}

