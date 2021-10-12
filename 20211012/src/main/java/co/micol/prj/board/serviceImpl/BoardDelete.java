package co.micol.prj.board.serviceImpl;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardDelete implements Command {
	private Scanner sc = new Scanner(System.in);
	private BoardService boardService = new BoardServiceImpl();

	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("====공지사항 삭제====");
		System.out.println("삭제할 공지사항의 번호를 입력해주세요.");
		board.setBId(sc.nextInt());

		int n = boardService.boardDelete(board);
		if (n != 0) {
			System.out.println("공지사항이 삭제되었습니다.");
		} else {
			System.out.println("공지사항의 삭제를 실패하였습니다.");
		}
	}

}
