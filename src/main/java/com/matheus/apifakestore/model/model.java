package com.matheus.apifakestore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class model {
    private int id;
    private String title;
    private String price;
    private String category;
    private String description;


}