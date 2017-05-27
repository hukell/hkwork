package com.example.administrator.hkwork;

import android.app.Application;

import com.example.hkframework.utils.SharePreHelper;
import com.example.hkframework.utils.Utils;

/**
 * Created by Administrator on 2017/5/27.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SharePreHelper.getIns().initialize(this, null);
        Utils.init(this);
    }
}
