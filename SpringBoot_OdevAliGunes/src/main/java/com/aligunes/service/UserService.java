package com.aligunes.service;


import com.aligunes.dto.request.LoginRequestDto;
import com.aligunes.dto.request.RegisterRequestDto;
import com.aligunes.dto.response.UserResponseDto;
import com.aligunes.exception.ResourceNotFoundException;
import com.aligunes.mapper.IUserMapper;
import com.aligunes.repository.IUserRepository;
import com.aligunes.repository.entity.User;
import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class UserService {



    private final IUserRepository userRepository;


    public List<User> findAll() {

        return userRepository.findAll();
    }

    public User findById(Long id) {

        Optional<User> user=userRepository.findById(id);
        if (user.isEmpty()){
            throw new RuntimeException("Kullanıcı bulunamadı");
        }
        return user.get();


    }

    public User createUser(User user) {

        return userRepository.save(user);
    }

    public User register(RegisterRequestDto dto) {
     //    User user=User.builder()
      //          .firstName(dto.getFirstName())
      //          .lastName(dto.getLastName())
      //          .email(dto.getEmail())
      //          .password(dto.getPassword()).build();

        User user=IUserMapper.INSTANCE.toUser(dto);
        return userRepository.save(user);

    }

    public UserResponseDto login(LoginRequestDto dto) {
        Optional<User> user= userRepository.findByEmailAndPassword(dto.getEmail(), dto.getPassword());

        if (user.isEmpty()){
            throw new ResourceNotFoundException("Kullanıcı bulunamadı");
        }

       /* UserResponseDto userResponseDto=UserResponseDto.builder()
                .id(user.get().getId())
                .firstName(user.get().getFirstName())
                .lastName(user.get().getLastName())
                .email(user.get().getEmail())

                .build();
        */
         // UserResponseDto userResponseDto=IUserMapper.INSTANCE.toUserResponseDto(user.get());
            return IUserMapper.INSTANCE.toUserResponseDto(user.get());



    }
}
