package com.vaagmi.vtm.service;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

/**
 * Created by rishii on 6/24/2015.
 */
public class Json_Array_Extractor {


    public String toString()

    {
        return "Values"+ Arrays.toString(Get_Countries);
    }

    public String[] getGet_Countries() {
        return Get_Countries;
    }

    public void setGet_Countries(String[] get_Countries) {
        Get_Countries = get_Countries;
    }

    @SerializedName("Get_Countries")
    private String[] Get_Countries;

}
