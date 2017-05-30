package com.example.aacrecord;

/**
 * Created by Administrator on 2017/5/13.
 */

public class OggRecord {
    static {
        System.loadLibrary("oggrecord");
    }
    public static native int  initRecord(String outputPath);
    public static native int  writeAudioData(byte[] pcmData,int len);
    public static native void closeRecord();
}
