package list;

import java.util.ArrayList;

public class TestClass03 {
	public static void main(String[] args) {
		
		ArrayList<String> arr= new ArrayList<>();
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		System.out.println(arr.contains("222"));
		System.out.println(arr.contains("없는값"));
		
		boolean bool = arr.contains("없는값");
		System.out.println("bool : " + bool);
		
		System.out.println("삭제 전 : " +arr);
		
		System.out.println("=========== index로 삭제 ============");
		arr.remove(0);
		System.out.println("0번째 삭제 후 값 : " + arr);
		
		System.out.println("========== 값으로 삭제 ==========");
		arr.remove("333");
		System.out.println("333 삭제 후 값 : " + arr);
	
	
	
	}
}
