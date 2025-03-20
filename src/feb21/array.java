package feb21;

public class array {
	public static void main(String[] args) {
		int [] arr = {12,23,34,56,77}; //1st way of array creation
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1]);
		
		String s1 = "hello from";
		System.out.println(s1.length());		
		
		
		int[] arr1 = new int[5];
		System.out.println(arr1[1]);
		arr1[1] = 23;
		System.out.println(arr1[1]);
	}
}
