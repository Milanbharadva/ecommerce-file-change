package com.webmintinfotech.ecom.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class GetCouponResponse {

    @SerializedName("data")
    private CouponData data;

    @SerializedName("message")
    private String message;

    @SerializedName("status")
    private Integer status;

    public CouponData getData() {
        return data;
    }

    public void setData(CouponData data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

