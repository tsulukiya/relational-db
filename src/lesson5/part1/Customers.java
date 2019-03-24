package lesson5.part1;

public class Customers {
    private long customerId;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;

    public Customers(long customerId, String companyName, String contactName, String contactTitle, String address,
                     String city, String region, String postalCode, String country, String phone, String fax) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }

    public Customers(long customerId) {
        this.customerId = customerId;
    }
}
