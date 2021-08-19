package com.example.droidcaffev1;

public class Store {
    private final int storeImage;
    private String storeTitle;
    private String storeDescription;

    Store (int storeImage, String storeTitle, String storeDescription){
        this.storeTitle = storeTitle;
        this.storeImage = storeImage;
        this.storeDescription = storeDescription;
    }

    public int getStoreImage() {
        return storeImage;
    }

    public String getStoreTitle() {
        return storeTitle;
    }

    public String getStoreDescription() {
        return storeDescription;
    }
}
