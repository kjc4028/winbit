package web.page.Service;

import java.util.List;

import web.page.DTO.BoardDto;

public interface BoardService {

	public List<BoardDto> bbsList() throws Exception;
	
	public void newWrite(BoardDto dto) throws Exception;
	
	public int maxGnum() throws Exception;
	
	public List<BoardDto> pageView(int startBBS, int perPage) throws Exception;
	
	public BoardDto contentView(int bbsID) throws Exception;
	
	public int totalBBS() throws Exception;

	public void reWrite(BoardDto dto) throws Exception;
	
	public void bbsDelete(int bbsID) throws Exception;
	
	public void bbsUpdate(String title, String content, int bbsID) throws Exception;

	
}
