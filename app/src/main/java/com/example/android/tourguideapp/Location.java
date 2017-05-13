package com.example.android.tourguideapp;

import android.widget.ImageView;

public class Location {

    public Location(String locationName, String locationDescription) {
        this.locationName = locationName;
        this.locationDescription = locationDescription;
    }

    public Location(String locationName, String locationDescription, int imageResourceId) {
        this.locationName = locationName;
        this.locationDescription = locationDescription;
        mImageResourceId = imageResourceId;
    }

    public String getLocationName() {
        return locationName;
    }

    private String locationName;

    public String getLocationDescription() {
        return locationDescription;
    }

    private String locationDescription;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}