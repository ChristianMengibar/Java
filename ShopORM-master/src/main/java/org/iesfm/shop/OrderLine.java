package org.iesfm.shop;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Item")
public class OrderLine implements Serializable {
    @Id
    @Column(name = "order_id")
    private int orderId;
    @Id
    @OneToOne
    private Article article;
    private int amount;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return orderId == orderLine.orderId && amount == orderLine.amount && Objects.equals(article, orderLine.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, article, amount);
    }
}
