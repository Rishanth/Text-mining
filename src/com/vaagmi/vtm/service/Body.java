package com.vaagmi.vtm.service;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rishii on 6/22/2015.
 */
public class Body {
    public String[] getBpart() {
        return bpart;
    }

    public void setBpart(String[] bpart) {
        this.bpart = bpart;
    }

    @SerializedName("bpart")
     private String[] bpart;

}
