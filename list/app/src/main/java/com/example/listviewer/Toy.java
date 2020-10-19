package com.example.listviewer;

import android.graphics.Bitmap;

public class Toy {



    private int price;

    private String title;

    private String subTitle;

    private Bitmap bitmap;

    public Toy(int price, String title, String subTitle, Bitmap bitmap)

    {



        this.price = price;

        this.title = title;

        this.subTitle = subTitle;

        this.bitmap = bitmap;

    }



    public int getPrice() {

        return price;

    }

    public void setPrice(int price) {

        this.price = price;

    }

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public String getSubTitle() {

        return subTitle;

    }

    public void setSubTitle(String subTitle) {

        this.subTitle = subTitle;

    }



    public Bitmap getBitmap() {

        return bitmap;

    }



    public void setBitmap(Bitmap bitmap) {

        this.bitmap = bitmap;

    }



}