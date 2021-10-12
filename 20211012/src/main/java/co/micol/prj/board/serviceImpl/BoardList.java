package co.micol.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardList implements Command {
	@Override
	public void execute() {
		BoardService boardService = new BoardServiceImpl();
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = boardService.boardSelectList();

		System.out.println("====공지사항 목록====");
		for (BoardVO board : boards) {
			System.out.print(board.getBId() + " : ");
			System.out.print(board.getBWriter() + " : ");
			System.out.print(board.getBWriteDate() + " : ");
			System.out.print(board.getBTitle() + " : ");
			System.out.println(board.getBContents() + " : ");
			System.out.println(board.getBHit());
		}
		System.out.println("===공지사항 목록 끝===");
	}

}
