package com.adityasinha.projects.managefinance.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mongodb.lang.NonNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
@Data
@NoArgsConstructor
public class User {


    @JsonProperty("fullName")
    private String fullName;

    @Id
    @JsonProperty("email")
    @NonNull
    private String email;

    @JsonProperty("password")
    private String password;
}
