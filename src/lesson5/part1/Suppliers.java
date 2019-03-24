package lesson5.part1;

public class Suppliers {
    private long supplierId;
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
    private String homePage;

    public Suppliers(long supplierId, String companyName, String contactName, String contactTitle, String address,
                     String city, String region, String postalCode, String country, String phone, String fax, String homePage) {
        this.supplierId = supplierId;
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
        this.homePage = homePage;
    }

    public Suppliers(long supplierId) {
        this.supplierId = supplierId;
    }
}
