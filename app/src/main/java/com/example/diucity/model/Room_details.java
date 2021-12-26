package com.example.diucity.model;

public class Room_details {
    String roomName;
    String roomType;
    String price;
    Integer imageUrl;

    public Room_details(String roomName, String roomType, String price, Integer imageUrl) {
        this.roomName = roomName;
        this.roomType = roomType;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
