package com.media.Model;

public class Podcast extends MediaContent implements Downloadable,Playable {
    private String host;

    public Podcast(int id, String tittle, int duration, String host) {
        super(id, tittle, duration);
        this.host = host;
    }


    //Getters & Setters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    //Override Interfaces
    @Override
    public void download() {}

    @Override
    public void play() {}
}
