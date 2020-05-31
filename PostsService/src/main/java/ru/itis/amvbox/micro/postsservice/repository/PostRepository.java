package ru.itis.amvbox.micro.postsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.amvbox.micro.postsservice.models.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByOwnerId(Long ownerId);
}