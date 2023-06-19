package list;

import java.util.ArrayList;

public class TestClass02 {
	public static void main(String[] args) {
		
		// 배열 : .length;
		// ArrayList 크기 : .size();
		
		ArrayList<String> arr = new ArrayList<>();
		
		System.out.println(arr.size());
		
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		String s = arr.get(0);
		System.out.println("0 : " + s);
		
		for (int i=0; i< arr.size(); i++) {
			s = arr.get(i);
			System.out.println(s);
			// System.out.println(arr.get(i));
		}
		
		System.out.println("---- for each ----");
		for (String ss : arr) {
			System.out.println(ss);
		}
		
		
	}
}
