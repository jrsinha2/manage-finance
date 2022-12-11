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

    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("email")
    @NonNull
    private String email;

    @JsonProperty("password")
    private String password;
}
