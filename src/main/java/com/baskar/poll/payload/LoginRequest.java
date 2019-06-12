package com.baskar.poll.payload;


import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Data
public class LoginRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;

}
