package com.example.base_final;

public class Modelclass {
    private int imageview;
    private String textview1;
    private String textview2;
    private String textview3;
    private String divisor;

    Modelclass(int imageview1, String textview1){
        this.imageview = imageview1;
        this.textview1 = textview1;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public String getTextview1() {
        return textview1;
    }

    public void setTextview1(String textview1) {
        this.textview1 = textview1;
    }
}
