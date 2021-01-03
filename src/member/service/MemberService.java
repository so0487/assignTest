package member.service;

import java.util.List;

import dto.MemberVO;

public interface MemberService {
	public List<MemberVO>getMemberList();
	public String getMemberPass(String id);
}
