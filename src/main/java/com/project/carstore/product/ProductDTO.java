package com.project.carstore.product;

public class ProductDTO {
    private Long Id;
    private String Name;
    private Double Price;
    private String Description;
    private String ImageUrl;
    private Integer Quantity;

    public ProductDTO() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
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

    public ProductDTO(Long id, String name, Double price, String description, String imageUrl, Integer quantity) {
        Id = id;
        Name = name;
        Price = price;
        Description = description;
        ImageUrl = imageUrl;
        Quantity = quantity;
    }
}
