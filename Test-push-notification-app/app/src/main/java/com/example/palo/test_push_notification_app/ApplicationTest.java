package com.example.palo.test_push_notification_app;


import android.app.Application;

import com.urbanairship.UAirship;

public class ApplicationTest extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        UAirship.takeOff(this, new UAirship.OnReadyCallback() {
            @Override
            public void onAirshipReady(UAirship airship) {
                airship.getPushManager().setUserNotificationsEnabled(true);
            }
        });

        String channelId = UAirship.shared().getPushManager().getChannelId();
        System.out.println("My Application Channel ID: " + channelId);
    }
}
