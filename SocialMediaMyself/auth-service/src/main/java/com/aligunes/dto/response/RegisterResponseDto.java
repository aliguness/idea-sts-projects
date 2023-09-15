package com.aligunes.dto.response;

import com.aligunes.repository.enums.ERole;
import com.aligunes.repository.enums.EStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class RegisterResponseDto {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String activationCode;

}
