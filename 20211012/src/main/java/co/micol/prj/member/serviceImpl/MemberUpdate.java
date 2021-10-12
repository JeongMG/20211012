package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberUpdate implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService memberService = new MemberServiceImpl();
	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("====회원정보 수정====");
		System.out.println("수정할 회원의 아이디를 입력해주세요.");
		member.setId(sc.nextLine());
		System.out.println("수정할 이름을 입력해주세요.");
		member.setName(sc.nextLine());
		System.out.println("수정할 비밀번호를 입력해주세요.");
		member.setPassword(sc.nextLine());
		System.out.println("수정할 연락처를 입력해주세요.");
		member.setTel(sc.nextLine());
		System.out.println("수정할 주소를 입력해주세요.");
		member.setAddress(sc.nextLine());
		System.out.println("수정할 역할을 입력해주세요.");
		member.setAuthor(sc.nextLine());
		
		int n = memberService.memberUpdate(member);
		if(n!=0) {
			System.out.println("회원 정보를 수정하였습니다.");
		} else {
			System.out.println("회원 정보 수정을 실패하였습니다.");
		}
	}

}
