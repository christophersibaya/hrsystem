package com.sars.hrsystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "addresses")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Long employee_id;

    @Column(name = "residential")
    private String residential;

    @Column(name = "postal")
    private String postal;

    public Address() {
    }

    public Address(String residential, String postal) {
        this.residential = residential;
        this.postal = postal;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getResidential() {
        return residential;
    }

    public void setResidential(String residential) {
        this.residential = residential;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "employee_id=" + employee_id +
                ", residential='" + residential + '\'' +
                ", postal='" + postal + '\'' +
                '}';
    }
}
