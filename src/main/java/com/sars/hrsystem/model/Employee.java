package com.sars.hrsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "employee_number")
    private String employeeNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "employee_id")
    private Address address;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "employee_id")
    private ContactDetails contactDetails;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "employee_id")
    private SocialMediaAddress socialMediaAddress;

    public Employee() {
    }

    public Employee(String employeeNumber, String firstName, String lastName, Address address, ContactDetails contactDetails, SocialMediaAddress socialMediaAddress) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactDetails = contactDetails;
        this.socialMediaAddress = socialMediaAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public SocialMediaAddress getSocialMediaAddress() {
        return socialMediaAddress;
    }

    public void setSocialMediaAddress(SocialMediaAddress socialMediaAddress) {
        this.socialMediaAddress = socialMediaAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", contactDetails=" + contactDetails +
                ", socialMediaAddress=" + socialMediaAddress +
                '}';
    }
}
