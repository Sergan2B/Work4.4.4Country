package com.example.work444;

public class Country {
    private String  imageCountry;
    private String tvCountry, tvCapital;

    public String getImageCountry() {
        return imageCountry;
    }

    public void setImageCountry(String imageCountry) {
        this.imageCountry = imageCountry;
    }

    public String getTvCountry() {
        return tvCountry;
    }

    public void setTvCountry(String tvCountry) {
        this.tvCountry = tvCountry;
    }

    public String getTvCapital() {
        return tvCapital;
    }

    public void setTvCapital(String tvCapital) {
        this.tvCapital = tvCapital;
    }

    public Country(String  imageCountry, String tvCountry, String tvCapital) {
        this.imageCountry = imageCountry;
        this.tvCountry = tvCountry;
        this.tvCapital = tvCapital;
    }
}
