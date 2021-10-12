package co.micol.prj.board.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardUpdate implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService boardService = new BoardServiceImpl();
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("====공지사항 수정====");
		System.out.println("수정할 공지사항의 번호를 입력해주세요.");
		board.setBId(sc.nextInt());
		System.out.println("수정할 내용을 입력해주세요.");
		board.setBContents(sc.nextLine());
		
		int n = boardService.boardUpdate(board);
		if(n!=0) {
			System.out.println("공지사항을 수정하였습니다.");
		} else {
			System.out.println("공지사항의 수정을 실패하였습니다.");
		}
	}

}
