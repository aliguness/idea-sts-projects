package com.aligunes.controller;



import com.aligunes.repository.entity.Post;
import com.aligunes.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.aligunes.constant.RestApiUrl.*;


@RestController
@RequestMapping(POST)
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    //  http://localhost:8080/post/findAll
    //  posts (GET): Tüm yazıları listeler
    @GetMapping(FINDALL) //"/findAll"
    public List<Post> findAll(){

        return postService.findAll();
    }


    @GetMapping(FINDBYID + "/{id}")   // "post/findById/{id}"
    public ResponseEntity<Post> findById(@PathVariable(value="id") Long id){

        return ResponseEntity.ok(postService.findById(id));
    }

    @PostMapping(CREATEPOST)   //"/createPost"
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return ResponseEntity.ok(postService.createPost(post));

    }

}
