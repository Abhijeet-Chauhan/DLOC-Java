package march7;

import java.util.Arrays;

public class code5 {
public static void main(String[] args) {
	String s1 = "Today we have an event in our college";
	String[] arr = s1.split(" ");
	System.out.println(Arrays.toString(arr));
	int  max = 0;
	int index = 0;
	for(int i=0; i<arr.length; i++) {
		if(arr[i].length()>max) {
			max = arr[i].length();
			index  = i;
		}
	}
	System.out.println(max+","+arr[index]);
}
}
