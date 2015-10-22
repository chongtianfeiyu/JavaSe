package cn.zucc.day03;

public class Board {
	private int boardId;
	private String boardName;
	private int parentId;
	public Board(){
		this.boardName = "jsp";
	}
	public int getBoardId(){
		return boardId;
	}
	public String getBoardName(){
		return boardName;
	}

	public int getParentId(){
		return parentId;
	}

}
