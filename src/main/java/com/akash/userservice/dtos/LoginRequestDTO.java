package com.akash.userservice.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDTO {
    @JsonProperty("eMail")
    private String eMail;
    @JsonProperty("password")
    private String password;
}
