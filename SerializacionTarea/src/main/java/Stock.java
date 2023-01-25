import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Stock {
    private int productId;
    private double price;
    private String name;
    //Porque class es una palabra reservada, y ponemos la palabra que nos pidan.
    @JsonProperty("class")
    private List<String> genre;

    @JsonCreator
    public Stock(
            @JsonProperty("productId") int productId,
            @JsonProperty("price") double price,
            @JsonProperty("name") String name,
            @JsonProperty("class") List<String> genre) {
        this.productId = productId;
        this.price = price;
        this.name = name;
        this.genre = genre;
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

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return productId == stock.productId && Double.compare(stock.price, price) == 0 && Objects.equals(name, stock.name) && Objects.equals(genre, stock.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, price, name, genre);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "productId=" + productId +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }
}
