package lesson5.part1;

public class OrderDetails {
    private long orderDetailsId;
    private Orders order;
    private Products product;
    private double unitPrice;
    private int quantity;
    private double discount;


    public OrderDetails(long orderDetailsId, Orders order, Products product, double unitPrice, int quantity, double discount) {
        this.orderDetailsId = orderDetailsId;
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}
