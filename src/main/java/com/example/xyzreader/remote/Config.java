package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json");
            /*
                url = new URL("https://go.udacity.com/xyz-reader-json");
                -  This URL requires increasing the performance of TextView using RecyclerView
                   to display paragraphs of text rather than fetching entire text during load.
                   Explanation: https://www.youtube.com/watch?v=x-FcOX6ErdI&feature=youtu.be&t=25m39s
             */
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
