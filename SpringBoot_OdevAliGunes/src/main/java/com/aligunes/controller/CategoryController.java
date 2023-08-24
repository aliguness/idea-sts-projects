package com.aligunes.controller;


import com.aligunes.repository.entity.Category;

import com.aligunes.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.aligunes.constant.RestApiUrl.*;

@RestController
@RequestMapping(CATEGORY)
@RequiredArgsConstructor


public class CategoryController {

    private final CategoryService categoryService;

    //  posts (GET): Tüm kategorileri listeler
    //  http://localhost:8080/category/findall

    @GetMapping(FINDALL) //"/findAll"
    public List<Category> findAll(){

        return categoryService.findAll();
    }


    @GetMapping(FINDBYID + "/{id}")   // "category/findById/{id}"
    public ResponseEntity<Category> findById(@PathVariable(value="id") Long id){

        return ResponseEntity.ok(categoryService.findById(id));
    }

    @PostMapping(CREATECATEGORY)   //"/createcategory"
    public ResponseEntity<Category> createPost(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.createCategory(category));

    }


}
