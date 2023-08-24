package com.aligunes.service;


import com.aligunes.exception.ResourceNotFoundException;
import com.aligunes.repository.IPostRepository;
import com.aligunes.repository.entity.Post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor

public class PostService {

    private final IPostRepository postRepository;

    public List<Post> findAll() {

        return postRepository.findAll();
    }

    public Post findById(Long id) {

        Optional<Post> post=postRepository.findById(id);
        if (post.isEmpty()){
            throw new ResourceNotFoundException("Yazı bulunamadı");
        }
        return post.get();


    }

    public Post createPost(Post post) {
            return postRepository.save(post);
        }
    }


