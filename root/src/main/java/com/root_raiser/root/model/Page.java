package com.root_raiser.root.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pageId;

    private String productName;
    private int productRemaining;
    private int userId;
    private int productId;
    private float price;
    private String attachments;

    public Page() {

    }

    public Page(int id, String productName, int productNum, int userId, int productId, float price, String attachments) {
        this.pageId = id;
        this.productName = productName;
        this.productRemaining = productNum;
        this.userId = userId;
        this.productId = productId;
        this.price = price;
        this.attachments = attachments;
    }

    public int getPageId() {
        return this.pageId;
    }

    public void setPageId(int id) {
        this.pageId = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductRemaining() {
        return productRemaining;
    }

    public void decreProductRemaining() {
        this.productRemaining--;
    }

    public void increProduct() {
        this.productRemaining++;
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

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }
}
