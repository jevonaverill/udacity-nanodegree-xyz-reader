package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

import com.example.xyzreader.BuildConfig;

import android.util.Log;

public class Config {
  public static final URL BASE_URL;
  private static String TAG = Config.class.toString();

    static {
    URL url = null;
    try {
      // TODO: change with new one
      url = new URL("https://raw.githubusercontent"
          + ".com/jevonaverill/udacity-nanodegree-xyz-reader/master/data.json");
    } catch (MalformedURLException ignored) {
      // TODO: throw a real error
      if (BuildConfig.DEBUG) {
        Log.e(TAG, "Please check your internet connection.");
      }
    }

    BASE_URL = url;
  }
}
