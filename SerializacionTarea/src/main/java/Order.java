import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {
    private int orderId;
    //Porque el JSON puede tener un formato de fecha diferente, entonces con pattern le cambiamos al patron que nos pidan.
    @JsonFormat(pattern = "dd/MM/yy")
    private Date date;
    private double price;
    private List<Item>items;

    @JsonCreator
    public Order(
            @JsonProperty("orderId") int orderId,
            @JsonProperty("date") Date date,
            @JsonProperty("price") double price,
            @JsonProperty("items") List<Item> items) {
        this.orderId = orderId;
        this.date = date;
        this.price = price;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Double.compare(order.price, price) == 0 && Objects.equals(date, order.date) && Objects.equals(items, order.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, date, price, items);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", date=" + date +
                ", price=" + price +
                ", items=" + items +
                '}';
    }
}
