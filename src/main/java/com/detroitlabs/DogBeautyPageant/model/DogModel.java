package com.detroitlabs.DogBeautyPageant.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DogModel {

    String url;
    int place;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }


    public int placeMultiplier(int place){
        return place * 2;
    }
//    public DogModel(String url, int place) {
//        this.url = url;
//        this.place = place;
//    }
}
