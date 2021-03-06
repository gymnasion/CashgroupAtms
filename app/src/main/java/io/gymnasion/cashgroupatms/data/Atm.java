package io.gymnasion.cashgroupatms.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Atm {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("bank")
    @Expose
    public Bank bank;
    @SerializedName("city")
    @Expose
    public City city;
    @SerializedName("street")
    @Expose
    public String street;
    @SerializedName("zip")
    @Expose
    public String zip;
    @SerializedName("latitude")
    @Expose
    public Double latitude;
    @SerializedName("longitude")
    @Expose
    public Double longitude;

    public Atm(Integer id, Bank bank, City city, String street, String zip, Double latitude, Double longitude){
        this.id = id;
        this.bank = bank;
        this.city = city;
        this.street = street;
        this.zip = zip;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
