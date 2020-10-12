package com.example.randomfox;

import android.graphics.Bitmap;

public class FoxApodObject {
    private static String image;
    private static String link;
    private static Bitmap bitmap;

    public FoxApodObject(String image, String link) {
        this.image = image;
        this.link = link;
    }

    public static String getImage() {
        return image;
    }

    public static String getLink() {
        return link;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String toString() {
        return "FoxApodObject{}";
    }
}
