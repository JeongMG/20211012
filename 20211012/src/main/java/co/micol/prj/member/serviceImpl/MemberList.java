package co.micol.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberList implements Command {
	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		List<MemberVO> list = new ArrayList<MemberVO>();
		list = memberService.memberSelectList();
		
		for(MemberVO member : list) {
			System.out.print(member.getId() + " : ");
			System.out.print(member.getName() + " : ");
			System.out.print(member.getPassword() + " : ");
			System.out.print(member.getTel() + " : ");
			System.out.print(member.getAddress() + " : ");
			System.out.println(member.getAuthor() + " : ");
		}
	}

}
