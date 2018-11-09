package com.example.rkjc.news_app_2;

public class NewsItem {
    private String title;
    private String description;
    private String url;
    private String author;
    private String img;
    private String published;

    public NewsItem(String title, String description, String url, String author, String img, String published) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.author = author;
        this.img = img;
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    @Override
    public String toString(){
        return getTitle() +"\n" + getDescription() +"\n" + getUrl() +"\n" + getAuthor() +"\n" + getImg() +"\n" + getPublished();
    }
}
