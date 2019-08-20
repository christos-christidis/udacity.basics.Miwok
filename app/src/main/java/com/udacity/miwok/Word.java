package com.udacity.miwok;

class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private final int mImageResourceId;

    Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = NO_IMAGE_PROVIDED;
    }

    Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
