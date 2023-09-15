package com.aligunes.mapper;

import com.aligunes.dto.request.RegisterRequestDto;
import com.aligunes.dto.response.RegisterResponseDto;
import com.aligunes.repository.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthMapper {

    IAuthMapper INSTANCE = Mappers.getMapper(IAuthMapper.class);

    Auth toAuth(RegisterRequestDto dto);  //parantez içindeki veriyi alıp Auth olarak dön.

    RegisterResponseDto toRegisterResponseDto(Auth auth);

}
