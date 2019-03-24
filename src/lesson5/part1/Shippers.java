package lesson5.part1;

public class Shippers {
    private long shipperId;
    private String companyName;
    private String phone;

    public Shippers(long shipperId, String companyName, String phone) {
        this.shipperId = shipperId;
        this.companyName = companyName;
        this.phone = phone;
    }

    public Shippers(long shipperId) {
        this.shipperId = shipperId;
    }
}
