package Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(123, "Yaya", "Handphone");
        order.registerObserver(new Customer("Yaya", "yaya@gmail.com"));
        order.registerObserver(new LogisticsSystem());

        order.updateStatus(OrderStatus.PROCESSING);
        order.updateStatus(OrderStatus.SHIPPED);
        order.updateStatus(OrderStatus.DELIVERED);
}
}