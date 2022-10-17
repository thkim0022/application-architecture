package com.k1m743hyun.data.mapper;

import com.k1m743hyun.data.dto.response.MemberResponseDto;
import com.k1m743hyun.data.dto.response.MemberResponseDto.MemberResponseDtoBuilder;
import com.k1m743hyun.data.entity.Member;
import java.util.Optional;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-16T18:50:23+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15.1 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public MemberResponseDto toDto(Optional<Member> request) {
        if ( request == null ) {
            return null;
        }

        MemberResponseDtoBuilder memberResponseDto = MemberResponseDto.builder();

        return memberResponseDto.build();
    }
}