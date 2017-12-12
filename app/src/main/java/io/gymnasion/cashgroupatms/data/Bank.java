package io.gymnasion.cashgroupatms.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bank {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("name")
    @Expose
    public String name;

}
