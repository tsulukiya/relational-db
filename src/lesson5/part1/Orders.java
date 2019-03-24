package lesson5.part1;

import java.util.Date;

public class Orders {
    private long orderId;
    private Customers customer;
    private Employees employee;
    private Shippers shipper;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String shipVia;
    private String freight;
    private String shipName;
    private String shipAdress;
    private String shipCity;
    private String shipRegion;
    private String postalCode;
    private String shipCountry;

    public Orders(long orderId, Customers customer, Employees employee, Shippers shipper, Date orderDate, Date requiredDate,
                  Date shippedDate, String shipVia, String freight, String shipName, String shipAdress, String shipCity,
                  String shipRegion, String postalCode, String shipCountry) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.shipper = shipper;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAdress = shipAdress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.postalCode = postalCode;
        this.shipCountry = shipCountry;
    }

    public Orders(long orderId) {
        this.orderId = orderId;
    }
}
