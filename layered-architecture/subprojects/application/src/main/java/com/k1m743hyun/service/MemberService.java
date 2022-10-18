package com.k1m743hyun.service;

import com.k1m743hyun.data.dto.request.MemberRequestDto;
import com.k1m743hyun.data.dto.response.MemberResponseDto;
import com.k1m743hyun.data.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberDomainService memberDomainService;

    private final MemberMapper memberMapper;

    public MemberResponseDto getMember(MemberRequestDto requestDto) {
        return memberMapper.toDto(memberDomainService.getMember(requestDto));
    }

    public MemberResponseDto saveMember(MemberRequestDto requestDto) {
        return memberMapper.toDto(memberDomainService.saveMember(requestDto));
    }

    public MemberResponseDto editMember(MemberRequestDto requestDto) {
        return memberMapper.toDto(memberDomainService.editMember(requestDto));
    }

    public MemberResponseDto deleteMember(MemberRequestDto requestDto) {
        return memberMapper.toDto(memberDomainService.deleteMember(requestDto));
    }
}