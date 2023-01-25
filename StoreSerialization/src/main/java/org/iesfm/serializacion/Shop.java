package org.iesfm.serializacion;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Shop {
    private String name;
    private List<Catalog> catalog;
    private List<Order> orders;

    public Shop(@JsonProperty("name")String name,
                @JsonProperty("catalog")List<Catalog> catalog,
                @JsonProperty("orders")List<Order> orders) {
        this.name = name;
        this.catalog = catalog;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Catalog> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Catalog> catalog) {
        this.catalog = catalog;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) && Objects.equals(catalog, shop.catalog) && Objects.equals(orders, shop.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, catalog, orders);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", catalog=" + catalog +
                ", orders=" + orders +
                '}';
    }
}