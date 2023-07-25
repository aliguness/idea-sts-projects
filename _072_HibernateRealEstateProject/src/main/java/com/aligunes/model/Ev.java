package com.aligunes.model;

import com.aligunes.model.enums.EnumEvStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Ev {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "yapim_yili")
    private LocalDate yapimYili;

    private String tur;
    private int kat;
    private String semt;

    @Builder.Default //Lombok burada, enum'ın default değeridir diyor
    @Enumerated(EnumType.STRING)
    private EnumEvStatus durum=EnumEvStatus.MUSAIT;


}
