package com.manav.JobListing.controller;

import com.manav.JobListing.model.Post;
import com.manav.JobListing.repository.PostRepository;
import com.manav.JobListing.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;


    @RequestMapping(value = "/")
    @CrossOrigin("http://localhost:3000/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    @CrossOrigin("http://localhost:3000/")
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin("http://localhost:3000/")

    public List<Post> search(@PathVariable String text){
        return searchRepository.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin("http://localhost:3000/")
    public Post addPost(@RequestBody Post post) {
        return postRepository.save(post);
    }


}
