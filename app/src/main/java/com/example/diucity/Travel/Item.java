package com.example.diucity.Travel;

public class Item {
    private String itemTitle;
    private int itemImageResourceId;
    private String placeLocation;
    private String[] place_Highlights;


    public Item(String title, int imageResourceId, String location) {
        itemTitle = title;
        itemImageResourceId = imageResourceId;
        placeLocation = location;
    }

    public Item(String title, int imageResourceId, String location, String[] highlights) {
        itemTitle = title;
        itemImageResourceId = imageResourceId;
        placeLocation = location;
        place_Highlights = highlights;

    }


    public String[] getHighlights() {
        return place_Highlights;
    }




    public String getTitle() {
        return itemTitle;
    }


    public int getImageResourceId() {
        return itemImageResourceId;
    }


    public String getLocation() {
        return placeLocation;
    }

}
