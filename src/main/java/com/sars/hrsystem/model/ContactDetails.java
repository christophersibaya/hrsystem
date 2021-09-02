package com.sars.hrsystem.model;

import javax.persistence.*;
import javax.swing.*;
import java.io.Serializable;

@Entity
@Table(name = "contact_details")
public class ContactDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long employee_id;

    @Column(name = "land_line")
    private String landLine;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    public ContactDetails() {
    }

    public ContactDetails(String landLine, String mobile, String email) {
        this.landLine = landLine;
        this.mobile = mobile;
        this.email = email;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "employee_id=" + employee_id +
                ", landLine='" + landLine + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
