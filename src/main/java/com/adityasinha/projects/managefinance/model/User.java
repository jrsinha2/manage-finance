package com.adityasinha.projects.managefinance.model;

import com.mongodb.lang.NonNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
@Data
public class User {

    @Id
    private int id;

    @NonNull
    private String username;

    private String fullname;

    @NonNull
    private String email;

    private String password;

    private String contactNumber;
}
