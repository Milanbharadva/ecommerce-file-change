package com.webmintinfotech.ecom.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class ProductReviewResponse {



    @SerializedName("all_review")
    private AllReview allReview;

    @SerializedName("message")
    private String message;

    @SerializedName("status")
    private Integer status;


    public AllReview getAllReview() {
        return allReview;
    }

    public String getMessage() {
        return message;
    }

    public Integer getStatus() {
        return status;
    }
}

