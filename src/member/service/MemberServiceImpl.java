package member.service;

import java.sql.SQLException;
import java.util.List;

import dto.MemberVO;
import member.dao.MemberDAO;
import member.dao.MemberDAOImpl;

public class MemberServiceImpl implements MemberService{
	
	private static MemberService memberService = new MemberServiceImpl();
	private MemberDAO memberDAO;
	
	private MemberServiceImpl() {
		memberDAO = MemberDAOImpl.getInstance();
	}
	
	public static MemberService getInstance(){
		if(memberService ==null){
			memberService = new MemberServiceImpl();
		}
		return memberService;
	}

	@Override
	public List<MemberVO> getMemberList() {
		List<MemberVO> memberList = null;
		try {
			memberList = memberDAO.getMemberList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}

	@Override
	public String getMemberPass(String id) {
		String pwd = null;
		try {
			pwd = memberDAO.getMemberPass(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pwd;
	}
}
