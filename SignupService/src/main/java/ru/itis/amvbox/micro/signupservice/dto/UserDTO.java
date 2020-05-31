package ru.itis.amvbox.micro.signupservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.amvbox.micro.signupservice.models.User;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDTO {

    private Long id;
    private String name;
    private String surname;
    private String email;

    public static UserDTO from(User user) {
        return UserDTO.builder()
                .email(user.getEmail())
                .name(user.getName())
                .surname(user.getSurname())
                .id(user.getId())
                .build();
    }

    public static List<UserDTO> from(List<User> users) {
        return users.stream()
                .map(UserDTO::from)
                .collect(Collectors.toList());
    }
}
