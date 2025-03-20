package march7;

public class code4 {
public static void main(String[] args) {
//	int[] arr = { 1,1,-1,-1,-1,-1,1,1-1,-1 };
//	int mount = 0;
//	int valley = 0;
//	int ground = 0;
//	
//	for(int i=0; i<arr.length; i++) {
//		ground += arr[i];
//		if(ground != 0 ) {
//			if(arr[i]==1) {
//				mount +=1;
//			}
//			else {
//				valley +=1;
//			}
//			
//		}
//	}
//	System.out.println("mountains:"+mount);
//	System.out.println("vallies: "+valley);
	int steps= 8;
	String path = "DDUUUUDD";
	countmv(steps,path);
	
	
}
public static void countmv(int steps, String path) {
	int level = 0;
	int valley = 0;
	int mountain = 0;
	for(int i=0; i<steps;i++) {
		if(path.charAt(i)=='U') {
			if(level==0) {
				mountain++;
			}
			level++;
		}
		if(path.charAt(i)=='D') {
			if(level==0) {
				valley++;
			}
			level--;
		}
	}
	System.out.println("mountain: "+mountain);
	System.out.println("valley "+valley);
}
}
