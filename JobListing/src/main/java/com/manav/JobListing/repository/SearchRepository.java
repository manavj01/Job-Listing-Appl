package com.manav.JobListing.repository;

import com.manav.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {

   List<Post> findByText(String text);
}
