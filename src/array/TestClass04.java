package array;

public class TestClass04 {
	public static void main(String[] args) {
		
		int[] arr = {100, 200, 300};
		double[] dos = {1.11, 2.22, 3.33};
		String[] str = {"aaa", "bbb", "ccc"};
		
		
		/*
		 for (int i =0; i< arr.length; i++){
		 	System.out.println(num);
		 }
		 */
		for(int num : arr) {
			System.out.println(num);
		}
		
		for(double d : dos) {
			System.out.println(d);
		}
		
		for(String s : str) {
			System.out.println(s);
		}
		
		
	}
}
