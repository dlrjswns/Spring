package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardVO;

public class InsertAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardVO vo=new BoardVO();
		vo.setWriter(request.getParameter("writer"));
		vo.setContent(request.getParameter("content"));
		vo.setTitle(request.getParameter("title"));
		BoardDAO dao=new BoardDAO();
		if(!dao.insert(vo)) {
			System.out.println("insert실패!");
		}
		
		ActionForward forward=new ActionForward();
		forward.setPath("main.do");
		forward.setRedirect(true);
		return forward;
	}

}
