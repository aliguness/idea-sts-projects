package com.aligunes.mapper;

import com.aligunes.dto.request.DoRegisterRequestDto;
import com.aligunes.dto.request.UserProfileSaveRequestDto;
import com.aligunes.repository.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthMapper {

    IAuthMapper INSTANCE= Mappers.getMapper(IAuthMapper.class);

    Auth toAuth(final DoRegisterRequestDto dto);

    @Mapping(target = "authid",source = "id")
    UserProfileSaveRequestDto fromAuth (final Auth auth);

}
