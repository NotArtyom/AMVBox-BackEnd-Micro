package ru.itis.amvbox.micro.postsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.amvbox.micro.postsservice.dto.PostViewDTO;
import ru.itis.amvbox.micro.postsservice.repository.PostRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<PostViewDTO> getAll() {
        return postRepository.findAll()
                .stream()
                .map(post -> PostViewDTO.builder()
                        .description(post.getDescription())
                        .youtubeLink(post.getYoutubeLink())
                        .dislikeCount(post.getDislikeCount())
                        .likeCount(post.getLikeCount())
                        .ownerId(post.getId())
                        .build()).collect(Collectors.toList());
    }

    @Override
    public List<PostViewDTO> getAllByUserId(Long id) {
        return postRepository.findAll()
                .stream()
                .filter(post -> post.getOwnerId().equals(id))
                .map(post -> PostViewDTO.builder()
                        .description(post.getDescription())
                        .youtubeLink(post.getYoutubeLink())
                        .dislikeCount(post.getDislikeCount())
                        .likeCount(post.getLikeCount())
                        .ownerId(post.getId())
                        .build()).collect(Collectors.toList());
    }

    @Override
    public Optional<PostViewDTO> getById(Long id) {
        return postRepository.findById(id).map(post -> PostViewDTO.builder()
                .description(post.getDescription())
                .youtubeLink(post.getYoutubeLink())
                .dislikeCount(post.getDislikeCount())
                .likeCount(post.getLikeCount())
                .ownerId(post.getId())
                .build());
    }
}
