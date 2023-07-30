package com.multicampus.vuongduyhieu_queryjpa.controller;

import com.multicampus.vuongduyhieu_queryjpa.model.Post;
import com.multicampus.vuongduyhieu_queryjpa.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    //Liệt kê các bài viết về các bài hát thuộc thể loại Nhạc trữ tình
    @GetMapping("/getbycatename")
    public List<Post> getPostByCateName(){
        return postService.getPostByCateName("Nhạc trữ tình");
    }
    //Liệt kê các bài viết của tác giả “Nhacvietplus”
    @GetMapping("/getbyautname")
    public List<Post> getPostByAutName(){
        return postService.getPostByAutName("Nhacvietplus");
    }
    //Liệt kê các bài viết với các thông tin sau: mã bài viết, tên bài viết, tên bài hát, tên tác giả, tên
    //thể loại, ngày viết
//    @GetMapping()
//    public List<Post> getAllPostCustom(){
//        return postService.getAllPostCustom();
//    }
}
