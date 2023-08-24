package com.aligunes.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



/* Dto nedir? Data transfer object ( modellerimiz, napıcaz modelleme yapacağız?)
Biz kullanıcıdan requestler alıyoruz. Kayıt alıyoruz. Kullanıcan belirli parametreler istiyoruz. (ad,soyad,mail gibi)
Kullanıcıdan bütün parametreleri doldurmasını bekleyemeyiz.  Yani
Kullanıcı kayıt olmak için istekte bulunacak(request) Bütün verileri girmeyecek. O zaman bizim save metodunda
en azami en gerekli olan seyler neler?; bunlarla   model oluşturacağız.

Register için bir model oluşturacağz.

 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class RegisterRequestDto {

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
