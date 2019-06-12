package com.example.internwork.model;

public class Message {

    private int imageId;
    private String title;
    private String details;

    public Message(int imageId, String title, String messageDetails) {
        this.imageId = imageId;
        this.title = title;
        this.details = messageDetails;
    }


    public String getTitle() {
        return title;
    }

    public String getDtails() {
        return details;
    }

    public int getImageId() {
        return imageId;
    }
}
