package com.akash.userservice.dtos;

import com.akash.userservice.models.Role;
import com.akash.userservice.models.User;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class UserDTO {
    private String email;
    private Set<Role> roles= new HashSet<>();

    public static UserDTO from(User user){
        UserDTO userDTO=new UserDTO();
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }
}
