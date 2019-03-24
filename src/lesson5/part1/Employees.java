package lesson5.part1;

import java.util.Date;

public class Employees {
    private long employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String homePhone;
    private String extension;
    private String photo;
    private String notes;
    private StringBuffer reportsTo;

    public Employees(long employeeId, String lastName, String firstName, String title, String titleOfCourtesy,
                     Date birthDate, Date hireDate, String address, String city, String region, String postalCode,
                     String country, String homePhone, String extension, String photo, String notes,
                     StringBuffer reportsTo) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
    }

    public Employees(long employeeId) {
        this.employeeId = employeeId;
    }
}
