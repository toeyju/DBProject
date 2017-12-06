package com.example.dbproject.model;

/**
 * Created by RTA on 12/5/2017.
 */

public class Potter {
    public final String id;
    public final String question;
    public final String picture;
    public final String rightans;
    public final String wrongans;

    public Potter(String id, String question, String picture, String rightans, String wrongans) {
        this.id = id;
        this.question = question;
        this.picture = picture;
        this.rightans = rightans;
        this.wrongans = wrongans;
    }
}
