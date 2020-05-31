package ru.itis.amvbox.micro.postsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostViewDTO {

    private Long ownerId;
    private String youtubeLink;
    private String description;
    private Long likeCount;
    private Long dislikeCount;
}
