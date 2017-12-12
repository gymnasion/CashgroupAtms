package io.gymnasion.cashgroupatms;

public class Atm {

    private String name, city, street, zip;
    private double lat, lng;

    public Atm(String name, String city, String street, String zip, double lat, double lng ) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.zip = zip;
        this.lat = lat;
        this.lng = lng;
    }
}
