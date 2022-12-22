package com.thkim0022.data.mapper;

import com.thkim0022.data.dto.request.MemberRequestDto;
import com.thkim0022.data.dto.response.MemberResponseDto;
import com.thkim0022.data.dto.response.MemberResponseDto.MemberResponseDtoBuilder;
import com.thkim0022.data.entity.Member;
import com.thkim0022.data.entity.Member.MemberBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-22T16:18:45+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member toEntity(MemberRequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        MemberBuilder member = Member.builder();

        member.userId( requestDto.getUserId() );
        member.userName( requestDto.getUserName() );

        return member.build();
    }

    @Override
    public MemberResponseDto toDto(Member request) {
        if ( request == null ) {
            return null;
        }

        MemberResponseDtoBuilder memberResponseDto = MemberResponseDto.builder();

        memberResponseDto.userId( request.getUserId() );
        memberResponseDto.userName( request.getUserName() );

        return memberResponseDto.build();
    }
}
