package ir.maktab56.domain;

import ir.maktab56.base.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address extends BaseEntity<Long> {
    @OneToOne(mappedBy = "address")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name="student_id", nullable=false)
    private Student student;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postalAddress")
    private String postalAddress;

    @Column(name = "postalCode", length = 10)
    private String postalCode;

    @Column(name = "number")
    private Integer number;

    public Address(String state, String city, String postalAddress, String postalCode, Integer number) {
        this.city = city;
        this.state = state;
        this.postalAddress = postalAddress;
        this.postalCode = postalCode;
        this.number = number;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}