// Test class for OrderDetail
public class TestOrderDetail {
    public static void main(String[] args) {
        FoodItem item = new FoodItem(102, "Pizza", 12.50);
        OrderDetail detail = new OrderDetail(1, item);

        System.out.println(detail.getDetail());
        System.out.println("Total Price: $" + detail.getPrice());
    }
}
