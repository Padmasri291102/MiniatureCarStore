package com.project.carstore.product;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    @Column(nullable = false,length = 100)
    private String Name;

    @Column(nullable = false)
    private Double Price;

    @Column(nullable = false,length = 1000)
    private String Description;

    @Column(nullable = false)
    private String ImageUrl;

    @Column(nullable = false)
    private Integer Quantity;

    public Product() {
    }

    public Product( String name, Double price, String description, String imageUrl, Integer quantity) {

        Name = name;
        Price = price;
        Description = description;
        ImageUrl = imageUrl;
        Quantity = quantity;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }
}
