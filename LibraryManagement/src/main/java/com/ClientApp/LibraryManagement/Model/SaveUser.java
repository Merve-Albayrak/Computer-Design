package com.ClientApp.LibraryManagement.Model;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class SaveUser {

    private String firstName;
    private String lastName;

    private String userName;


    private String password;
}
