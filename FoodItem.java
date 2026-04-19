// This class extends Food (inheritance)
public class FoodItem extends Food {

    public FoodItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getDetails() {
        return "Food ID: " + id + ", Item: " + name + ", Price: $" + price;
    }
}
