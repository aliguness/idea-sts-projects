package com.aligunes.service;


import com.aligunes.exception.ResourceNotFoundException;
import com.aligunes.repository.ICategoryRepository;
import com.aligunes.repository.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class CategoryService {

    private final ICategoryRepository categoryRepository;
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {

        Optional<Category> category=categoryRepository.findById(id);
        if (category.isEmpty()){
            throw new ResourceNotFoundException("Categori bulunamadı");
        }
        return category.get();


    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
