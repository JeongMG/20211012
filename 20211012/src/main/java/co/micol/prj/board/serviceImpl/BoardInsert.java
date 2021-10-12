package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardInsert implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService boardService = new BoardServiceImpl();
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("====공지사항 등록====");
		System.out.println("작성자를 입력하세요.");
		board.setBWriter(sc.nextLine());
		System.out.println("공지 제목을 입력하세요.");
		board.setBTitle(sc.nextLine());
		System.out.println("공지 내용을 입력하세요.");
		board.setBContents(sc.nextLine());
		
		int n = boardService.boardInsert(board);
		
		if(n != 0) {
			System.out.println("공지사항이 등록되었습니다.");
		} else {
			System.out.println("공지사항의 등록을 실패했습니다.");
		}
	}

}
