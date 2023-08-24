package com.aligunes.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//Burada login olundugunda neleri dönebiliriz onu belirteceğiz. Bilgi notu...

public class UserResponseDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    //passwordu geri dönmeyeceğiz. bilgi notu..


}
