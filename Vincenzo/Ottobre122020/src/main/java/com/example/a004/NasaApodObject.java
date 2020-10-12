package com.example.a004;

import android.graphics.Bitmap;

import java.io.Serializable;

public class NasaApodObject implements Serializable {
    private String data;
    private String explanation;
    private String mediaType;
    private String serviceVersion;
    private String title;
    private String url;
    private Bitmap bitmap;

    public NasaApodObject(String data, String explanation, String mediaType, String serviceVersion, String title, String url) {
        this.data = data;
        this.explanation = explanation;
        this.mediaType = mediaType;
        this.serviceVersion = serviceVersion;
        this.title = title;
        this.url = url;
    }

    public String getData() {
        return data;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getMediaType() {
        return mediaType;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NasaApodObject{");
        sb.append("data='").append(data).append('\'');
        sb.append(", explanation='").append(explanation).append('\'');
        sb.append(", mediaType='").append(mediaType).append('\'');
        sb.append(", serviceVersion='").append(serviceVersion).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
