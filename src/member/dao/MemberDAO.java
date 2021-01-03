package member.dao;

import java.sql.SQLException;
import java.util.List;

import dto.MemberVO;

public interface MemberDAO {
	/**
	 * memberList 조회
	 * @return
	 * @throws SQLException
	 */
	public List<MemberVO> getMemberList()throws SQLException;
	
	/**
	 * member pwd 조회
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public String getMemberPass(String id) throws SQLException;
	
}
