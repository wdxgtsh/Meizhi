package me.drakeet.meizhi.util;

/**
 * Created by drakeet on 8/14/15.
 */
public class LoveStringUtils {

    public static String getVideoPreviewImageUrl(String resp) {
        int s0 = resp.indexOf("<h1>休息视频</h1>"); if (s0 == -1) return null;
        int s1 = resp.indexOf("<img", s0); if (s1 == -1) return null;
        int s2 = resp.indexOf("http:", s1); if (s2 == -1) return null;
        int e2 = resp.indexOf(".jpg", s2) + ".jpg".length(); if (e2 == -1) return null;
        return resp.substring(s2, e2);
    }
}
