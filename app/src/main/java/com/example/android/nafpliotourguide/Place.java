package com.example.android.nafpliotourguide;

public class Place {
    private static int NO_IMAGE_PROVIDED = -1;
    private String Name, Description;
    private int ImageId = NO_IMAGE_PROVIDED;

    public Place(String name, String description) {
        Name = name;
        Description = description;
    }

    public Place(String name, String description, int imageId) {
        Name = name;
        Description = description;
        ImageId = imageId;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public int getImageId() {
        return ImageId;
    }

    public boolean hasImage() {
        return ImageId != NO_IMAGE_PROVIDED;
    }
}

