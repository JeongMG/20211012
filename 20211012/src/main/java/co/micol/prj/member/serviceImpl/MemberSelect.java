package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	private MemberService memberService = new MemberServiceImpl();
	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("====회원 조회====");
		System.out.println("조회할 회원의 아이디를 입력하세요.");
		member.setId(sc.nextLine());
		member = memberService.memberSelect(member);
		System.out.println("아이디 : " + member.getId());
		System.out.println("이 름 : " + member.getName());
		System.out.println("암 호 : " + member.getPassword());
		System.out.println("연락처 : " + member.getTel());
		System.out.println("주 소 : " + member.getAddress());	
		System.out.println("역 할 : " + member.getAuthor());
		
	}

}
