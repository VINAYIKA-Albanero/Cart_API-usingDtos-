package com.example.demo.model;


import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private List<Product> products;
}

