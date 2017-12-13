package io.gymnasion.cashgroupatms.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;

    public City(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
