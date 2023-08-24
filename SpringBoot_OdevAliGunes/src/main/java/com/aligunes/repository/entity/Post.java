package com.aligunes.repository.entity;


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
@Table(name = "posts")

/*

Yazı (Post):
• Blog yazılarını temsil eder.
• Yazının başlığı, içeriği, yayın tarihi, yazarı vb. bilgiler içerir.
• Yazının bir kategorisi olabilir.
posts" tablosu, "id", "title", "content", "published_at" ve "user_id" sütunlarını içerecek.

 */


public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    //TODO fieldlar ok mu
    @Column(name="published_at")
    @Builder.Default
    private LocalDate publishedAt=LocalDate.now();;
    /*  ??????????
      @Builder.Default
    private LocalDate date=LocalDate.now();
     */
    @Column(name="user_id")
    private Long userId;
    private Long categoryId;


}