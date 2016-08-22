package com.dyx.mddp;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by dayongxin on 2016/8/22.
 */
public class XApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
