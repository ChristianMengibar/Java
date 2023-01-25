package org.iesfm.serializacion;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Catalog {
    private int productId;
    private double price;
    private String name;
    @JsonProperty("class")
    private List<String> type;

    public Catalog(@JsonProperty("productId")int productId,
                   @JsonProperty("price")double price,
                   @JsonProperty("name")String name,
                   @JsonProperty("class")List<String> type) {
        this.productId = productId;
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog catalog = (Catalog) o;
        return productId == catalog.productId && Double.compare(catalog.price, price) == 0 && Objects.equals(name, catalog.name) && Objects.equals(type, catalog.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, price, name, type);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "productId=" + productId +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}