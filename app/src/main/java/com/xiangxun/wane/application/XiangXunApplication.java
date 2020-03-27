package com.xiangxun.wane.application;

import android.app.Application;

import com.xiangxun.wane.utils.CrashHandler;

/**application class
 *
 * Created by jianddongguo on 2017/7/20.
 */

public class XiangXunApplication extends Application {
    private CrashHandler mCrashHandler;
    private static XiangXunApplication sApplication;
    // File Directory in sd card
    public static final String DIRECTORY_NAME = "xiangxun";

    @Override
    public void onCreate() {
        sApplication = this;
        super.onCreate();
        mCrashHandler = CrashHandler.getInstance();
        mCrashHandler.init(getApplicationContext(), getClass());
    }

    public static XiangXunApplication getInstance() {
        return sApplication;
    }
}
