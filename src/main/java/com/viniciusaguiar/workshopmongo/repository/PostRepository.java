package com.viniciusaguiar.workshopmongo.repository;

import com.viniciusaguiar.workshopmongo.domain.Post;
import com.viniciusaguiar.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
