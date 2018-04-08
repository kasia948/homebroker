package com.homebroker.demo;
import javax.persistence.*;
import java.util.List;

@Entity
public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String www;
    private int deadlineYear;
    private int deadlineMonth;
    private int deadlineDay;
    private String city;
    private String street;
    private int number;

    @OneToMany
    @JoinColumn(name = "investment_id", referencedColumnName = "id")
    private List<OfferApartment> offerApartmentList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public int getDeadlineYear() {
        return deadlineYear;
    }

    public void setDeadlineYear(int deadlineYear) {
        this.deadlineYear = deadlineYear;
    }

    public int getDeadlineMonth() {
        return deadlineMonth;
    }

    public void setDeadlineMonth(int deadlineMonth) {
        this.deadlineMonth = deadlineMonth;
    }

    public int getDeadlineDay() {
        return deadlineDay;
    }

    public void setDeadlineDay(int deadlineDay) {
        this.deadlineDay = deadlineDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<OfferApartment> getOfferApartmentList() {
        return offerApartmentList;
    }

    public void setOfferApartmentList(List<OfferApartment> offerApartmentList) {
        this.offerApartmentList = offerApartmentList;
    }
}
