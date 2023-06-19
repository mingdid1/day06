package list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass06 {
	public static void main(String[] args) {
		
		ArrayList<String> id = new ArrayList<>();
		ArrayList<String> pw = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int i, num;
		String pId=null, pPw=null;
		
		
		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.회원정보 확인");
			num = sc.nextInt();
			
			switch (num) {
			
			case 1:
				if (id.size() == 0){
					System.out.println("회원가입을 해주세요");
					break;
				}
				System.out.println("id 입력 : ");
				pId = sc.next();
				System.out.println("pw 입력 : ");
				pPw = sc.next();
				
				for (i= 0; i < id.size(); i++) {
					if (pId.contains(id.get(i)) && pPw.contains(pw.get(i))){
						System.out.println("로그인 성공");
						
						System.out.println("========================");
						System.out.println("1.정보수정       2.회원탈퇴");
						int put= sc.nextInt();
						System.out.println("========================");
						if (put == 1) {
							System.out.println("변경할 pw : ");
							String chPw = sc.next();
							pw.set(i, chPw);
						}
						else if (put == 2) {
							id.remove(i);
							pw.remove(i);
							System.out.println("계정이 삭제되었습니다");
						}
					}else if (pId.contains(id.get(i)) && !(pPw.contains(pw.get(i)))) {
						System.out.println("비밀번호가 틀렸습니다");
					}else {
						System.out.println("계정이 존재하지 않습니다");
					}
				}
				
				break;
				
			case 2:
				while(true) {
					System.out.println("저장할 id 입력 : ");
					pId = sc.next();
					
					if (id.contains(pId)) {
						System.out.println("존재하는 id입니다");
					}
					else {
						System.out.println("저장할 pw 입력 : ");
						pPw = sc.next();
						id.add(pId);
						pw.add(pPw);
						System.out.println("등록 되었습니다!");
						break;						
					}
				}
				break;

			case 3: 
				if (id.size() == 0) {
					System.out.println("등록된 회원이 없습니다");
				}
				System.out.println("ID          pw");
				System.out.println("================");
				for (i = 0; i<id.size(); i++) {
					System.out.print(id.get(i)+ "            " + pw.get(i));
				}
				break;
			}
		}

	}
}
