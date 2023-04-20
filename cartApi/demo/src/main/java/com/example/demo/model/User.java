package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
//    private String email;
//    private String password;
//    private String firstName;
//    private String lastName;
//    private String address;
//    private String phone;
    private String walletId;

}



