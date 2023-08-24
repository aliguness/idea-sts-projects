package com.aligunes.mapper;

import com.aligunes.dto.response.CategoryResponseDto;
import com.aligunes.repository.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICategoryMapper {

    ICategoryMapper INSTANCE = Mappers.getMapper(ICategoryMapper.class);


    CategoryResponseDto toCategoryResponseDto(Category category);
}
