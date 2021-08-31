package ir.maktab56.domain;

import ir.maktab56.base.domain.BaseEntity;

import javax.persistence.Embeddable;

@Embeddable
public class Address extends BaseEntity<Long> {
    private String city;

    private String state;

    private String postalAddress;

    private String postalCode;

    private Integer number;


}
