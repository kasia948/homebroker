package com.homebroker.demo;
public enum OfferApartmentStatus {

    AVAILABLE("Wolne"),
    RESERVED("Zarezerwowane"),
    SOLD("Sprzedane");

    String displayName;

    OfferApartmentStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

