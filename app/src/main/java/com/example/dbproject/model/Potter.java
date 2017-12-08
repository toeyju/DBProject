package com.example.dbproject.model;

/**
 * Created by RTA on 12/8/2017.
 */

public class Potter {
    public final String quiz;
    public final String picture;
    public final String rightans;
    public final String wrongans;

    public Potter(String quiz, String picture, String rightans, String wrongans) {
        this.quiz = quiz;
        this.picture = picture;
        this.rightans = rightans;
        this.wrongans = wrongans;
    }
}
