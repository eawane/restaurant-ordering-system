// Abstract class for food items
public abstract class Food {
    protected int id;
    protected String name;
    protected double price;

    public Food(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // abstract method
    public abstract String getDetails();
}
