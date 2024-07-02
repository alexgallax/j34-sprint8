package edu.praktikum.sprint8;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Courier {

    private final String login;
    private final String password;
    private final String firstName;
}
