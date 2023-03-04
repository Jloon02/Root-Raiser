package com.root_raiser.root.model;

import java.util.List;

public class Page {
    private String productName;
    private int userId;
    private int productId;
    private float price;
    private float weight;
    private String attachments;

    public Page(String productName, int userId, int productId, float price, float weight, String attachments) {
        this.productName = productName;
        this.userId = userId;
        this.productId = productId;
        this.price = price;
        this.weight = weight;
        this.attachments = attachments;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }
}
