package com.nsjsoft.myhome.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {

    private Long id;
    private String username;
    private String password;
    private boolean bit;

}
