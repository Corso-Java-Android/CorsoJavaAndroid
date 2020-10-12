package com.example.a004;

public class NasaApodObject {
    private String data;
    private String explanation;
    private String mediaType;
    private String serviceVersion;
    private String title;
    private String url;

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
        return "NasaApodObject{" +
                "data='" + data + '\'' +
                ", explanation='" + explanation + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", serviceVersion='" + serviceVersion + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
