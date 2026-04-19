// This class links an order with food items
public class OrderDetail {
    private int orderId;
    private FoodItem food;

    public OrderDetail(int orderId, FoodItem food) {
        this.orderId = orderId;
        this.food = food;
    }

    public int getOrderId() {
        return orderId;
    }

    public FoodItem getFood() {
        return food;
    }

    public double getPrice() {
        return food.getPrice();
    }

    public String getDetail() {
        return "Order ID: " + orderId + " -> " + food.getDetails();
    }
}
