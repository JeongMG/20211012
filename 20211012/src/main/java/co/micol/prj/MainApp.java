package co.micol.prj;

//import java.util.ArrayList;
//import java.util.List;
//
//import co.micol.prj.board.service.BoardService;
//import co.micol.prj.board.service.BoardVO;
//import co.micol.prj.board.serviceImpl.BoardServiceImpl;

//import java.util.ArrayList;
//import java.util.List;

//import co.micol.prj.board.service.BoardService;
//import co.micol.prj.board.service.BoardVO;
//import co.micol.prj.board.serviceImpl.BoardServiceImpl;
//import co.micol.prj.member.service.MemberService;
//import co.micol.prj.member.service.MemberVO;
//import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.menu.Menu;

public class MainApp {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.run();
	}
}
//		List<MemberVO> list = new ArrayList<MemberVO>();
//		MemberService dao = new MemberServiceImpl();
//		list = dao.memberSelectList();
//		for(MemberVO member : list) {
//			System.out.println(member.getId() + " : " + member.getName());
//		}
//		System.out.println("======================");
//		BoardService bs = new BoardServiceImpl();
//		List<BoardVO> boards = new ArrayList<BoardVO>();
//		boards = bs.boardSelectList();
//		
//		for(BoardVO board : boards) {
//			System.out.println(board.getBId() + " : " + board.getBContents());
//		}

//		List<BoardVO> list = new ArrayList<BoardVO>();
//		BoardService dao = new BoardServiceImpl();
//		BoardVO vo = new BoardVO();
//		vo.setBWriter("관리자");
//		vo.setBTitle("마이바티스 테스트");
//		vo.setBContents("마이바티스는 sqlMapper로 dbms와 통신한다.");
//		
//		int n = dao.boardInsert(vo);
//		if(n != 0) {
//			System.out.println("입력 성공");
//			list = dao.boardSelectList();
//			for(BoardVO board : list) {
//				System.out.println(board.getBId() + " : " + board.getBContents());
//			}
//		} else {
//			System.out.println("실패");
//		}