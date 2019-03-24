package lesson5.part1;

public class Products {
    private long productId;
    private String productName;
    private Suppliers supplier;
    private Categories category;
    private int quantityPerUnit;
    private double unitPrice;
    private int unitInStock;
    private int unitOnOrder;
    private String recorderLevel;
    private double discontinued;

    public Products(long productId, String productName, Suppliers supplier, Categories category, int quantityPerUnit,
                    double unitPrice, int unitInStock, int unitOnOrder, String recorderLevel, double discontinued) {
        this.productId = productId;
        this.productName = productName;
        this.supplier = supplier;
        this.category = category;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
        this.unitOnOrder = unitOnOrder;
        this.recorderLevel = recorderLevel;
        this.discontinued = discontinued;
    }

    public Products(long productId) {
        this.productId = productId;
    }
}
