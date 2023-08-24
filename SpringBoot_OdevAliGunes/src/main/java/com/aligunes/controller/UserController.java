package com.aligunes.controller;

import com.aligunes.dto.request.LoginRequestDto;
import com.aligunes.dto.request.RegisterRequestDto;
import com.aligunes.dto.response.UserResponseDto;
import com.aligunes.repository.entity.User;
import com.aligunes.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.aligunes.constant.RestApiUrl.*;


import java.util.List;


@RestController
@RequestMapping(USER)
@RequiredArgsConstructor

public class UserController {

    // @Autowired  // (cons. enj veya autowired olacak burada final kullanıp RequiredArgs ilerledim)
    private final UserService userService;

    @GetMapping
    public String getHello() {

        return "Welcome";
    }

    //  /users (GET): Tüm kullanıcıları listeler.
    //  http://localhost:8080/users/findAll
    @GetMapping(FINDALL) //"/findAll"
    public List<User> findAll(){

        return userService.findAll();
    }


    // /users/{userId} (GET): Belirli bir kullanıcının detaylarını getirir.
    // http://localhost:8080/users/findById/2

    @GetMapping(FINDBYID + "/{id}")   // "/findById/{id}"
    public ResponseEntity<User> findById(@PathVariable(value="id") Long id){

        return ResponseEntity.ok(userService.findById(id));
    }


    // Postta urlden alamadıgımız için RequestBodyden nesne alıyoruz.)
    // /users (POST): Yeni bir kullanıcı oluşturur.
    // http://localhost:8080/users/createUser

    @PostMapping (CREATEUSER)   //"/createUser"
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));

    }

   /* GET ile olsaydı;    http://localhost:8080/users/createUser?name=Berna&lastname=Gunes&email=abcde@gmail.com&password=123456

    @GetMapping("/createUser")
    public User createUser(String name, String lastname, String email, String password) {

    User user=User.builder().name(name).lastName(lastname).email(email).password(password).build();

    return userService.createUser(user)}   */


    // http://localhost:8080/users/register
    @PostMapping (REGISTER)
    public ResponseEntity<User> register(@RequestBody RegisterRequestDto dto) {

        return ResponseEntity.ok(userService.register(dto));

    }

    // SWAGGER-UI http://localhost:8080/swagger-ui/index.html#/


    @PostMapping(LOGIN)
    public ResponseEntity<UserResponseDto> login(@RequestBody LoginRequestDto dto){

        return ResponseEntity.ok(userService.login(dto));
    }


}
