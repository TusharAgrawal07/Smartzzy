package com.example.diucity.model;

public class PopularHotel {

    private String name;
    private String prize;
    private Integer imageUrl;
    private String Place;


    public PopularHotel(String name, String place, Integer imageUrl, String prize) {
        this.name = name;
        this.Place = place;
        this.imageUrl = imageUrl;
        this.prize = prize;
    }
    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return prize;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }
}
