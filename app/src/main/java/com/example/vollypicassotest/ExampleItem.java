package com.example.vollypicassotest;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;
    private String mFirstName;
    private String mLastName;

    public ExampleItem(String imageUrl, String creator, int likes,String firstname,String lastname) {
        mImageUrl = imageUrl;
        mCreator = creator;
        mLikes = likes;
        mFirstName= firstname;
        mLastName= lastname;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

    public int getLikeCount() {
        return mLikes;
    }
    public String getFirstName(){
        return mFirstName;
    }
    public String getLastName(){
        return mLastName;
    }
}