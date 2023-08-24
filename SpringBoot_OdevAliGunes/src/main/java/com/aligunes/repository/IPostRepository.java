package com.aligunes.repository;

import com.aligunes.repository.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IPostRepository extends JpaRepository <Post, Long> {

    List<Post> findPostsByUserId(Long id);

    List <Post> findPostsByCategoryId(Long id);

    List<Post> findPostsByContentContainingIgnoreCase(String keyword);

    List<Post> findPostsByOrderByPublishedAtDesc();



}
