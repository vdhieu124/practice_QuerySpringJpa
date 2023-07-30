package com.multicampus.vuongduyhieu_queryjpa.service;

import com.multicampus.vuongduyhieu_queryjpa.model.Post;
import com.multicampus.vuongduyhieu_queryjpa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post> getPostByCateName(String name){
        return postRepository.findAllByCateName(name);
    }
    public List<Post> getPostByAutName(String name){
        return postRepository.findAllByAutName(name);
    }
    public List<Post> getAllPostCustom(){
        return postRepository.findAllCustom();
    }
}
