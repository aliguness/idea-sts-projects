package com.aligunes.service;

import com.aligunes.dto.request.UserProfileSaveRequestDto;
import com.aligunes.mapper.IUserProfileMapper;
import com.aligunes.repository.IUserProfileRepository;
import com.aligunes.repository.entity.UserProfile;
import com.aligunes.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository iUserProfileRepository;


    public UserProfileService(IUserProfileRepository iUserProfileRepository) {
        super(iUserProfileRepository);
        this.iUserProfileRepository = iUserProfileRepository;
    }
    public void saveDto(UserProfileSaveRequestDto dto){
      //  if(!iUserProfileRepository.existsUserProfileById(dto.getId())) {
            save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        //    return true;
       // }
        //return false;
    }
}
