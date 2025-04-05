//highest frequency letter
package march7;

public class code7 {
public static void main(String[] args) {
	String s = "dddwedcc ceeuc sccw";
	
	int max = 0;
	char freq = ' ';
	for(int i=0; i<s.length();i++) {
		int count = 0;
		for(int j=0; j<s.length();j++) {
			if(s.charAt(i)==' ') {
				continue;
			}
			else if(s.charAt(i)==s.charAt(j)) {
				count++;
			}
			
		}
		
		if (count > 0) {
			if(count>max) {
				max = count;
				freq = s.charAt(i);
				
			}
//            System.out.println(s.charAt(i) + ": " + count);
		
	}
}
	System.out.println("Highest frequency letter is: "+ freq +"\nFrequency is: "+max);
}
}

