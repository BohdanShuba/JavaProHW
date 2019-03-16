package ua.bohdan;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "Menu")
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "dish may not be null")
    private String dish;

    @NotNull(message = "price may not be null")
    private Double price;

    @NotNull(message = "weight may not be null")
    private Integer weight;

    @NotNull(message = "discount may not be null")
    private Boolean discount;

    public Menu() {
    }

    public Menu (String dish, Double price, Integer weight, Boolean discount){
        this.dish = dish;
        this.price = price;
        this.weight = weight;
        this.discount = discount;
    }
    public Integer getId() {
        return id;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean isDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ua.bohdan.Menu{" +
                "id=" + id +
                ", dish='" + dish + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", discount=" + discount +
                '}';
    }
}
