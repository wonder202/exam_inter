package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.Member;
import com.example.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    final MemberRepository memberRepository;
    
    @Override
    public int insertMember(Member member) {
        try{
            Member ret = memberRepository.save(member);
            if(ret != null){
                return 1;
            }
            return 0;
        }
        catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public Member selectOneMember(String id) {
        try {
            return memberRepository.findById(id).orElse(null);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
