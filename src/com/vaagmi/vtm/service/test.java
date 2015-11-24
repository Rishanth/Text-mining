package com.vaagmi.vtm.service;//import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rishii on 6/22/2015.
 */
public class test {
    @SerializedName("@id")
    private String id;
    @SerializedName("@src")
    String src;
    @SerializedName("@orig_item_date")
    private String orig_item_date;
    @SerializedName("@cat_id")
    private String cat_id;
    @SerializedName("heding")
    private String heding;
    @SerializedName("summary")
    private String summary;
    @SerializedName("body")
    public Body body;
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrig_item_date() {
        return orig_item_date;
    }

    public void setOrig_item_date(String orig_item_date) {
        this.orig_item_date = orig_item_date;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getHeding() {
        return heding;
    }

    public void setHeding(String heding) {
        this.heding = heding;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /*public cody getBody() {
        return body;
    }

    public void setBody(cody body) {
        this.body = body;
    }
   */


}
