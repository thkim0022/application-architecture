package com.thkim0022.data.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberRequestDto {

    private Long userId;
    private String userName;
}
