package com.multicampus.vuongduyhieu_queryjpa.controller;

import com.multicampus.vuongduyhieu_queryjpa.model.Category;
import com.multicampus.vuongduyhieu_queryjpa.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    //Liệt kê các thể loại nhạc chưa có bài viết cảm nhận nào
    @GetMapping("/getbynopost")
    public List<Category> getCategoryByNoPost(){
        return categoryService.getCategoryByNoPost();
    }

    //Tìm thể loại có số bài viết nhiều nhất
    @GetMapping("/getbymaxpost")
    public Category getCategoryByMaxPost(){
        return categoryService.getCategoryByMaxPost();
    }
}
