package array;

import java.util.Scanner;

public class TestClass08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] id = new String[5];
		String[] pwd = new String[5];
		
		int num=0, i=0;
		String inputId=null, inputPwd=null;
		
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.모든 회원보기");
			System.out.print(">>> : ");
			num = input.nextInt();
			
			switch(num) {
			
				case 1:
					if(id.length == 0) {
						System.out.println("회원가입 먼저 하세요!!");
						break;
					}
					
					System.out.print("비교 id 입력 : ");
					inputId = input.next();
					System.out.print("비교 pwd 입력 : ");
					inputPwd = input.next();
					
					for( i=0; i < id.length ; i++) {
						if(inputId.equals(id[i])) {
							if(inputPwd.equals(id[i])) {
								System.out.println("인증통과!!");
							}else {
								System.out.println("비밀번호 틀림");
							}
							break;
						}
					}
					
					if(i == id.length) {
						System.out.println("존재하지 않는 id입니다");
					}
					break;
					
				case 2:
					
					if( id[ id.length-1 ] != null) {
						System.out.println("저장 공간이 없습니다!!");
						break;
					}
					
					while(true) {
						System.out.println("저장할 id 입력 : ");
						inputId = input.next();
					
						for(i=0; i<id.length;i++) {
							if(inputId.equals(id[i])) {
								break;
							}else if(id[i] == null) {
								break;
							}
						}
						if(id[i] == null) {
							break;
						}
						System.out.println("존재하는 id입니다.");
						System.out.println("다시 입력 ... ");
					}
					System.out.println("저장할 pwd 입력 : ");
					inputPwd = input.next();
					
					id[i] = inputId;
					pwd[i] = inputPwd;
					
					System.out.println("등록 되었습니다!");
					break;
					
				case 3:
					if(id[i] == null) {
						System.out.println("저장된 정보가 없습니다");
						break;
					}
					
					System.out.println("id\tpassword");
					System.out.println("----------------");
					for(i=0 ; id[i] != null ; i++) {
						System.out.println(id[i]+"\t"+pwd[i]);
						if(i == id.length-1)
							break;
					}
					System.out.println("----------------");
					break;
					
				default: System.out.println("잘못입력..");
			}
		}
		
	}
}




