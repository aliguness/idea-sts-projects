package com.aligunes.repository;

import com.aligunes.repository.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

    Category findCategoryByName (String value);


}
