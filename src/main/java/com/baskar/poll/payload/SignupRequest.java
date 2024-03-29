package com.baskar.poll.payload;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SignupRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
