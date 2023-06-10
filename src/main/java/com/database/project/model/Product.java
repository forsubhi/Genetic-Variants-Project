package com.database.project.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table
@Getter
@Setter
public class Product {

    @Id
    @JsonIgnore
    private String id;

    private String index;

    private String brandName;

    private String details;

    private String sizes;

    private String mrp;

    private String sellPrice;

    private String discount;

    private String category;

}
