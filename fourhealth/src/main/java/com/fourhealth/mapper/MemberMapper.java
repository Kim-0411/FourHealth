package com.fourhealth.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import com.fourhealth.dto.Member;


@Mapper
public interface MemberMapper {

	public Member getMemberById(String memberId);
	public int addMember(Member member);
	
}
