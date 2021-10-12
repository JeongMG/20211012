package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService memberService = new MemberServiceImpl();

	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("====회원정보 삭제====");
		System.out.println("삭제할 회원의 아이디를 입력해주세요.");
		member.setId(sc.nextLine());
		
		int n = memberService.memberDelete(member);
		if(n!=0) {
			System.out.println("회원 정보가 삭제되었습니다.");
		} else {
			System.out.println("회원 정보의 삭제를 실패했습니다.");
		}
	}

}
