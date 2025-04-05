package march31;

interface i3{
	public int add(int i, int j);
}

public class code2 {
public static void main(String[] args) {
	i3 i=(x,y)->{
		return x+y;
	};
	int s = i.add(12, 13);
	//type inference which automatically take dtype in runtime
	System.out.println(s);
}
}
