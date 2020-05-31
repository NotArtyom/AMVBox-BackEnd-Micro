package ru.itis.amvbox.micro.postsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.itis.amvbox.micro.postsservice.dto.PostViewDTO;
import ru.itis.amvbox.micro.postsservice.service.PostService;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public ResponseEntity<List<PostViewDTO>> getAllPosts() {
        return ResponseEntity.ok(postService.getAll());
    }

    @GetMapping("/{user-id}")
    public ResponseEntity<List<PostViewDTO>> getAllPostsByUserId(@PathVariable(name = "user-id") Long userId) {
        return ResponseEntity.ok(postService.getAllByUserId(userId));
    }
}
