package com.mycompany.musicranking;

public class MusicData {
    private String name;
    private int viewCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    // toString() method
    @Override
    public String toString() {
        return "MusicData{" + "name=" + name + ", viewCount=" + viewCount + '}';
    }
}
