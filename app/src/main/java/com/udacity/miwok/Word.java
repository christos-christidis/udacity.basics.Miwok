package com.udacity.miwok;

class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private final int mImageResourceId;
    private final int mAudioResourceId;

    Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this(defaultTranslation, miwokTranslation, NO_IMAGE_PROVIDED, audioResourceId);
    }

    Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    int getAudioResourceId() {
        return mAudioResourceId;
    }

    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
