package com.example.paralacsrresyclerview;

public class SampelEntiti {
    private  String path;
    private  String title;

    public SampelEntiti(String title, String url){
        this.title = title;
        this.path = url;
    }

    public String   getPath() {
        return path;
    }

    public String getTitle() {
        return title;
    }
    public void setPath(String path) {
        this.path = path;
    }
}

