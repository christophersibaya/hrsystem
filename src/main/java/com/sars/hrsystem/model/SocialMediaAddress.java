package com.sars.hrsystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "social_media_addresses")
public class SocialMediaAddress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private long employee_id;

    @Column(name = "twitter")
    private String twitter;

    @Column(name = "instagram")
    private String instagram;

    @Column(name = "facebook")
    private String facebook;

    public SocialMediaAddress() {
    }

    public SocialMediaAddress(String twitter, String instagram, String facebook) {
        this.twitter = twitter;
        this.instagram = instagram;
        this.facebook = facebook;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString() {
        return "SocialMediaAddress{" +
                "employee_id=" + employee_id +
                ", twitter='" + twitter + '\'' +
                ", instagram='" + instagram + '\'' +
                ", facebook='" + facebook + '\'' +
                '}';
    }
}
