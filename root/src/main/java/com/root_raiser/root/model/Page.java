package com.root_raiser.root.model;

import java.util.List;

public class Page {

    private String title;
    private String summary;
    private List<String> labels;
    private String attachments;


    public Page(String title, String summary, List<String> labels, String attachments) {
        this.title = title;
        this.summary = summary;
        this.labels = labels;
        this.attachments = attachments;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public List<String> getLabels() {
        return labels;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }
}

