package com.aligunes.mapper;

import com.aligunes.dto.request.RegisterRequestDto;
import com.aligunes.dto.response.UserResponseDto;
import com.aligunes.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

// Neden mapper kullanıyoruz. Bir sürü field olsaydı bunları tektek istemek zor olacaktı. Bize yarıdmcı olan bir kütüphane
/* unmappedTargetPolicy = ReportingPolicy.IGNORE --> Eşleşmeyen mapper varsa ıgnore et hata verme. Bunun amacı bu. Eslesmeyen field
//olsaydı hata fırlatırdı.  */

/*ORM hibernate orm yapıyordu. Entityi databae'e mapliyordu. Databasedeki veri de entitye mapliyordu.
Şimdi bizim dto muz ve entitiy miz var mapleme yapmamız gerekiyor.
 */


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)


public interface IUserMapper {

    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

    UserResponseDto toUserResponseDto(User user);
    // user ile UserResponseDtodaki fieldleri mapleyecek (id=id) gibi  (id=ID olmaz birebir aynı olmalı).


    User toUser(RegisterRequestDto dto);
    }





