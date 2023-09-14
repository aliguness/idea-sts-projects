package com.aligunes.controller;

import com.aligunes.dto.request.UserProfileSaveRequestDto;
import com.aligunes.repository.entity.UserProfile;
import com.aligunes.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static com.aligunes.constant.EndPoints.*;


//http://localhost:9093/user
@RequiredArgsConstructor
@RestController
@RequestMapping(USER)
public class UserProfileController {

    private final UserProfileService userProfileService;

    // https://localhost:9093/user/save
    @PostMapping(SAVE)
    public ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto){
        return ResponseEntity.ok(userProfileService.saveDto(dto));
    }

    @GetMapping(GETALL)
    public ResponseEntity<List<UserProfile>> findAll(){
        return ResponseEntity.ok(userProfileService.findAll());
    }

    //localhost/user/getname
    @GetMapping("/getname")
    public ResponseEntity<String> getUpperCase(String firstName){
        return ResponseEntity.ok(userProfileService.getUpperCase(firstName));
    }

    @GetMapping("/clearcache")
    public ResponseEntity<String> clearCache(){
        userProfileService.clearCache();
        return ResponseEntity.ok().build();
    }
}
