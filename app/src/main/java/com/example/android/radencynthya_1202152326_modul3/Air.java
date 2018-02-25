package com.example.android.radencynthya_1202152326_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by ASUS on 23/02/2018.
 */

class Air {
    private final int imageResource;
    private String namaAir;
    private String info;

    static final String IMAGE_KEY = "Image Resource";
    static final String TITLE_KEY = "Title";

    public Air(String title, String info, int imageResource) {
        this.namaAir = title;
        this.info = info;
        this.imageResource = imageResource;
    }

    String getNamaAir() {
        return namaAir;
    }

    String getInfo() {
        return info;
    }

    public int getImageResource() {
        return imageResource;
    }

    }
