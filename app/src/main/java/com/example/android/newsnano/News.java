package com.example.android.newsnano;

public class News {

    //Declaration
    private String Title ;
    private String Section;
    private String Author;
    private String DateTime;
    private String Url;

    public News(String title, String section, String author, String datetime, String url) {
        Title = title;
        Section = section;
        Author = author;
        DateTime = datetime;
        Url = url;
    }

    public String getTitle() {
        return Title;
    }
    public String getSection() {
        return Section;
    }
    public String getAuthor(){
        return Author;
    }
    public String getDateTime() {
        return DateTime;
    }

    public String getUrl() {
        return Url;
    }
}
