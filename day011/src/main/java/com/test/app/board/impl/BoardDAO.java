package com.test.app.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.test.app.board.BoardVO;

@Repository("boardDAO")
public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String board_insert = "insert into board(bid,title,writer,content) values(???,?,?,?)";
	private String board_update = "update board1 set title=?,content=? where bid=?";
	private String board_delete = "delete board1 where bid=?";
	private String board_selectOne = "select * from board where bid=?";
	private String board_selectAll = "select * from board order by bid desc";

	 public void insertBoard(BoardVO vo) {
	      
	   }
	   public void updateBoard(BoardVO vo) {
	      
	   }
	   public void deleteBoard(BoardVO vo) {
	   
	   }
	   public BoardVO selectOne(BoardVO vo) {
	      return null;
	   }
	   public List<BoardVO> selectAll(BoardVO vo) {
	      return null;
	   }

}
