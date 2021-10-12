package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardSelect implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService boardService = new BoardServiceImpl();
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("====공지사항 조회====");
		System.out.println("조회할 공지의 번호를 입력하세요.");
		board.setBId(sc.nextInt());
		board = boardService.boardSelect(board);
		System.out.println("공지 번호 : " + board.getBId());
		System.out.println("작 성 자 : " + board.getBWriter());
		System.out.println("작 성 일 : " + board.getBWriteDate());
		System.out.println("공지 제목 : " + board.getBTitle());
		System.out.println("공지 내용 : " + board.getBContents());
		System.out.println("조 회 수 : " + board.getBHit());
	}

}
