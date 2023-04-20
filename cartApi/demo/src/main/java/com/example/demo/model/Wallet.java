package com.example.demo.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection = "wallets")
public class Wallet {
    @Id
    private String id;
    private double balance;
//    private String userId;

}
