package web.page.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.page.DAO.BoardDao;
import web.page.DTO.BoardDto;

@Service
public class BoardServiceImple implements BoardService {

	@Autowired
	BoardDao dao;
	
	@Override
	public List<BoardDto> bbsList() throws Exception {
		// TODO Auto-generated method stub
		return dao.view();
	}

	@Override
	public void newWrite(BoardDto dto) throws Exception {
		// TODO Auto-generated method stub
		
		dao.insert(dto);
	}


	@Override
	public int maxGnum() throws Exception {
		// TODO Auto-generated method stub
		return dao.maxGnum();
	}

	@Override
	public List<BoardDto> pageView(int startBBS, int perPage) throws Exception {
		// TODO Auto-generated method stub
		return dao.pageView(startBBS, perPage);
	}

	@Override
	public BoardDto contentView(int bbsID) throws Exception {
		// TODO Auto-generated method stub
		return dao.contentView(bbsID);
	}

	@Override
	public int totalBBS() throws Exception {
		// TODO Auto-generated method stub
		return dao.totalBBS();
	}

	@Override
	public void reWrite(BoardDto dto) throws Exception {
		// TODO Auto-generated method stub
		dao.reWrite(dto);
	}

	@Override
	public void bbsDelete(int bbsID) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bbsID);
	}

	@Override
	public void bbsUpdate(String title, String content, int bbsID) throws Exception {
		// TODO Auto-generated method stub
		dao.update(title, content, bbsID);
		
	}

}
