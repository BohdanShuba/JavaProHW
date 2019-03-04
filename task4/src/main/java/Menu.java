import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "MenuInRestaurant")

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "dish may not be null")
    private String dish;

    @NotNull(message = "price may not be null")
    private double price;

    @NotNull(message = "weight may not be null")
    private int weight;

    @NotNull(message = "discount may not be null")
    private boolean discount;

    public Menu() {
    }

    public Menu (String dish, double price, int weight, boolean discount){
        this.dish = dish;
        this.price = price;
        this.weight = weight;
        this.discount = discount;
    }
    public int getId() {
        return id;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", dish='" + dish + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", discount=" + discount +
                '}';
    }
}
