package march18;

import java.util.Arrays;

public class array {
public static void main(String[] args) {
	int [] arr = {1,2,5,4,3};
	int temp;
//	for(int i=0; i<=arr.length; i++) {
//		for(int j=i; j<arr.length; j++) {
//			if(arr[i]>arr[j]) {
//				temp = arr[i];
//				arr[i] = arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
}
}
