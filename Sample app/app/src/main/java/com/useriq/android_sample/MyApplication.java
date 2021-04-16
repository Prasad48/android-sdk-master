package com.useriq.android_sample;

import android.app.Application;

import com.useriq.sdk.UserIQSDK;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UserIQSDK.setHost("dev-mobile");
        UserIQSDK.init(this, "835a7fbaa05b0695b3951d0346244e87d5d81d8a");
    }
}
