package cn.trinea.android.common.util;

public class VersionUtils {
    /**
     * Indicates what OS (API level) the device is running
     * @return true if the device is running a pre-2.2 (FroYo) OS, false if OS is 2.2 or later
     * Encoder the string to base64
     */
    public static Boolean isPreFroYo() {
        return android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.FROYO;
    }
    /**
     * Indicates what OS (API level) the device is running
     * @return true if the device is running a pre-3.0 (Honeycomb) OS, false if OS is 3.0 or later
     * Encoder the string to base64
     */
    public static Boolean isPreHoneycomb() {
        return android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.HONEYCOMB;
    }
    
    /**
     * Indicates what OS (API level) the device is running
     * @return true if the device is running a pre-4.1 (Jelly Bean) OS, false if OS is 4.1 or later
     * Encoder the string to base64
     */
    public static Boolean isPreJellyBean() {
        return android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN;
    }
}
