public class Order {
    private int orderId;
    private String firstName;
    private String lastName;

    public Order(int orderId, String firstName, String lastName) {
        this.orderId = orderId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + firstName + " " + lastName;
    }
}
