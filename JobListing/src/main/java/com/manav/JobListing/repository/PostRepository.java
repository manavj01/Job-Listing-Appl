package com.manav.JobListing.repository;

import com.manav.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String > {

}
