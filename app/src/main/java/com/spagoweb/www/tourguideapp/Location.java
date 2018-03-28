package com.spagoweb.www.tourguideapp;

/**
 * Created by Robe on 15/10/2017.
 */

/**
 * {@link Location} represents some beautiful location that the user wants to learn.
 */
public class Location {

    /** String resource ID for the title of location */
    private int mLocationTitleId;

    /** String resource ID for the description of location */
    private int mLocationDescriptionId;

    /** Image resource ID for the location */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this location */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object.
     *
     * @param TitleId is the string resource ID for the location
     * @param DescriptionId is the string resource Id for the description of location

     */
    public Location(int TitleId, int DescriptionId) {
        mLocationTitleId = TitleId;
        mLocationDescriptionId = DescriptionId;
    }

    /**
     * Create a new Location object.
     *
     * @param TitleId is the string resource ID for the location
     * @param DescriptionId is the string resource Id for the description of location
     * @param imageResourceId is the drawable resource ID for the image associated with the location

     */
    public Location(int TitleId, int DescriptionId, int imageResourceId) {
        mLocationTitleId = TitleId;
        mLocationDescriptionId = DescriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the title the location.
     */
    public int getLocationTitleId() {
        return mLocationTitleId;
    }

    /**
     * Get the string resource ID for the description of location.
     */
    public int getLocationDescriptionId() {
        return mLocationDescriptionId;
    }

    /**
     * Return the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}