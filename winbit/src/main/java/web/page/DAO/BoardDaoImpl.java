package web.page.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import web.page.DTO.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	private static final String namespace = "web.page.mapper.BoardMapper";
	@Autowired
	private SqlSession sqlSession;
	
	@Transactional
	@Override
	public void insert(BoardDto dto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".new_write",dto);
	}

	@Override
	public List<BoardDto> view() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".list");
	}

	@Override
	public int maxGnum() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".maxGnum");
	}

	

	@Override
	public List<BoardDto> pageView(int startBBS, int perPage) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("getStartBBS", startBBS);
		param.put("getPerPage", perPage);
		

		return sqlSession.selectList(namespace+".listPage",param);
	}

	@Override
	public BoardDto contentView(int bbsID) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".contentView",bbsID);
	}

	@Override
	public int totalBBS() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+".totalBBS");
	}

	@Override
	public void reWrite(BoardDto dto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".reWrite",dto);
	}

	@Override
	public void delete(int bbsID) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".bbsDelete",bbsID);
		
	}

	@Override
	public void update(String title, String content, int bbsID) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("title", title);
		param.put("content", content);
		param.put("bbsID", bbsID);

		sqlSession.update(namespace+".bbsUpdate",param);
		
	}

}
