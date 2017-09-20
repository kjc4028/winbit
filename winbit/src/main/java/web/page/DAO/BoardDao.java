package web.page.DAO;

import java.util.List;

import web.page.DTO.BoardDto;

public interface BoardDao {
	
	public void insert(BoardDto dto) throws Exception;
	
	public List<BoardDto> view() throws Exception;
	
	public int maxGnum() throws Exception;
	
	public List<BoardDto> pageView(int startBBS, int perPage) throws Exception;
	
	public BoardDto contentView(int bbsID) throws Exception;
	
	public int totalBBS() throws Exception;
	
	public void reWrite(BoardDto dto) throws Exception;
	
	public void delete(int bbsID) throws Exception;
	
	public void update(String title, String content, int bbsID) throws Exception;
}
