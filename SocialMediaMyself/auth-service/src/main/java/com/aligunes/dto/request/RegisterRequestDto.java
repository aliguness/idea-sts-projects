package com.aligunes.dto.request;

import com.aligunes.repository.enums.ERole;
import com.aligunes.repository.enums.EStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequestDto {

    @NotBlank(message = "Kullanıcı adı boş geçilemez. ")
    private String username;
    @NotBlank(message = "Mail kısmı boş geçilemez. ")
    @Email
    private String email;
    @NotBlank(message = "Şifre kısmı boş geçilemez. ")
    @Size(max = 10, min = 3, message = "Şifre uzunluğu 3 ile 10 karakter arasında olmalıdır.")
 //   @Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$")
    private String password;
}
