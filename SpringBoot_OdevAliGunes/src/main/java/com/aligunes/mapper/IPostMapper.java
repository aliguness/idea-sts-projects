package com.aligunes.mapper;


import com.aligunes.dto.response.PostResponseDto;
import com.aligunes.repository.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPostMapper {

    IPostMapper INSTANCE = Mappers.getMapper(IPostMapper.class);

   PostResponseDto toPostResponseDto(Post post);

}
