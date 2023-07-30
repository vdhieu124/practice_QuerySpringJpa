package com.multicampus.vuongduyhieu_queryjpa.service;

import com.multicampus.vuongduyhieu_queryjpa.model.Category;
import com.multicampus.vuongduyhieu_queryjpa.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> getCategoryByNoPost(){
        return categoryRepository.findAllByNoPost();
    }
    public Category getCategoryByMaxPost(){
        return categoryRepository.findByMaxPost();
    }
}
