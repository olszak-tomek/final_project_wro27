package pl.sda.final_project;

import javax.persistence.Embeddable;


@Embeddable
public class Address {
    private String city;
    private String street;
    private Countries country;
    private String zipCode;




}
