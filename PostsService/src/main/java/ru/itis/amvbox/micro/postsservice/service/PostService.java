package ru.itis.amvbox.micro.postsservice.service;

import ru.itis.amvbox.micro.postsservice.dto.PostViewDTO;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<PostViewDTO> getAll();

    List<PostViewDTO> getAllByUserId(Long id);

    Optional<PostViewDTO> getById(Long id);
}
