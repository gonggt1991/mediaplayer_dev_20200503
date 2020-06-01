package com.broccoli.musicplayer.util;

import android.util.Log;

public final class LogUtil {
    private static final String TAG = "BROCCOLI";
    private static final int ERROR = 1;
    private static final int WARN = 2;
    private static final int DEBUG = 3;
    private static final int INFO = 4;
    private static final int VERBOSE = 5;

    private static int LOG_LEVEL = 3;

    public static void v(String content) {
        if (LOG_LEVEL >= VERBOSE) {
            Log.v(TAG, content);
        }
    }

    public static void i(String content) {
        if (LOG_LEVEL >= INFO) {
            Log.i(TAG, content);
        }
    }

    public static void d(String content) {
        if (LOG_LEVEL >= DEBUG) {
            Log.d(TAG, content);
        }
    }

    public static void w(String content) {
        if (LOG_LEVEL >= WARN) {
            Log.w(TAG, content);
        }
    }

    public static void e(String content) {
        if (LOG_LEVEL >= ERROR) {
            Log.e(TAG, content);
        }
    }

    public static void v(String tag, String content) {
        if (LOG_LEVEL >= VERBOSE) {
            Log.v(TAG + "###" + tag, content);
        }
    }

    public static void i(String tag, String content) {
        if (LOG_LEVEL >= INFO) {
            Log.i(TAG + "###" + tag, content);
        }
    }

    public static void d(String tag, String content) {
        if (LOG_LEVEL >= DEBUG) {
            Log.d(TAG + "###" + tag, content);
        }
    }

    public static void w(String tag, String content) {
        if (LOG_LEVEL >= WARN) {
            Log.w(TAG + "###" + tag, content);
        }
    }

    public static void e(String tag, String content) {
        if (LOG_LEVEL >= ERROR) {
            Log.e(TAG + "###" + tag, content);
        }
    }
}
