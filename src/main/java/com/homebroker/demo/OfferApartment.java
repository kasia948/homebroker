package com.homebroker.demo;
import javax.persistence.*;


@Entity
public class OfferApartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double surface;
    private int floor;
    private int roomsNumber;
    private String URLplan;
    private double price;
    private String description;

    @Enumerated(EnumType.STRING)
    private OfferApartmentStatus offerApartmentStatus;
    private boolean isPromoted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public String getURLplan() {
        return URLplan;
    }

    public void setURLplan(String URLplan) {
        this.URLplan = URLplan;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OfferApartmentStatus getOfferApartmentStatus() {
        return offerApartmentStatus;
    }

    public void setOfferApartmentStatus(OfferApartmentStatus offerApartmentStatus) {
        this.offerApartmentStatus = offerApartmentStatus;
    }

    public boolean isPromoted() {
        return isPromoted;
    }

    public void setPromoted(boolean promoted) {
        isPromoted = promoted;
    }
}
