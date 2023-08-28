package com.aligunes.service;

import com.aligunes.dto.request.UserProfileSaveRequestDto;
import com.aligunes.mapper.IUserProfileMapper;
import com.aligunes.repository.IUserProfileRepository;
import com.aligunes.repository.entity.UserProfile;
import com.aligunes.utility.ServiceManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService extends ServiceManager <UserProfile, Long> {


    private final IUserProfileRepository repository;

    public UserProfileService(IUserProfileRepository repository) {
        super(repository);
        this.repository = repository;
    }


    public Boolean saveDto(UserProfileSaveRequestDto dto) {
        /*
         {
         "authid": 2,
         "username": "Abdullah",
         "email": "Abdullah@gmail.com"
         }
         */

       /*
        UserProfile userProfile = new UserProfile();
        userProfile.setAuthid(dto.getAuthid());
        userProfile.setUsername(dto.getUsername());
        userProfile.setEmail(dto.getEmail());
        save(userProfile);
       */

        /*
        UserProfile userProfile = UserProfile.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build();
        save(userProfile);
        */

        /*
        save(UserProfile.builder()
                .authid(dto.getAuthid())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build());
        */

        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        return  true;
    }


    @Cacheable(value = "getUpperCase")
    public String getUpperCase(String firstName){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return firstName.toUpperCase();
    }


    @CacheEvict(value ="getUpperCase", allEntries = true)
    public void clearCache(){
        System.out.println("getUpperCase için oluşlturulan Cache değerleri silindi.");
    }


}
