package member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import dto.MemberVO;
import ibatis.config.SqlMapClientFactory;

public class MemberDAOImpl implements MemberDAO{

	private static MemberDAO memberDAO = new MemberDAOImpl();
	
	private SqlMapClient sqlMapClient;
	
	private MemberDAOImpl() {
		sqlMapClient = SqlMapClientFactory.getSqlMapClinet();
	}
	
	public static MemberDAO getInstance(){
		if(memberDAO == null){
			memberDAO = new MemberDAOImpl();
		}
		return memberDAO;
	}
	
	
	@Override
	public List<MemberVO> getMemberList() throws SQLException {
		return sqlMapClient.queryForList("member.memberList");
	}

	@Override
	public String getMemberPass(String id) throws SQLException {
		return (String) sqlMapClient.queryForObject("member.memberPass",id);
	}
	
	
	
}
