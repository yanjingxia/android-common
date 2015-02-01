
package cn.trinea.android.common.util;

import java.lang.reflect.Method;

import android.content.Context;
import android.telephony.TelephonyManager;

public class DeviceUtils {
    /**
     * Equipment is started for the first time the generated number Are
     * potential "9774d56d682e549c"
     *
     * @param context Context
     * @return Number
     */
    public static String getAndroidId(Context context) {
        return android.provider.Settings.System.getString(context.getContentResolver(),
                android.provider.Settings.Secure.ANDROID_ID);
    }

    /**
     * This device's SN
     *
     * @return SerialNumber
     */
    public static String getSerialNumber() {
        String serialNumber = android.os.Build.SERIAL;
        if ((serialNumber == null || serialNumber.length() == 0 || serialNumber.contains("unknown"))) {
            String[] keys = new String[] {
                    "ro.boot.serialno", "ro.serialno"
            };
            for (String key : keys) {
                try {
                    Method systemProperties_get = Class.forName("android.os.SystemProperties")
                            .getMethod("get", String.class);
                    serialNumber = (String)systemProperties_get.invoke(null, key);
                    if (serialNumber != null && serialNumber.length() > 0
                            && !serialNumber.contains("unknown"))
                        break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return serialNumber;
    }

    /**
     * 国际移动设备识别码（International Mobile Equipment
     * Identity，IMEI），即通常所说的手机序列号、手机“串号”
     * ，用于在手机网络中识别每一部独立的手机，是国际上公认的手机标志序号，相当于移动电话的身份证
     * 。序列号共有15位数字，前6位（TAC）是型号核准号码，代表手机类型
     * 。接着2位（FAC）是最后装配号，代表产地。后6位（SNR）是串号，代表生产顺序号
     * 。最后1位（SP）一般为0，是检验码，备用。国际移动设备识别码一般贴于机身背面与外包装上，同时也存在于手机内存中，通过输入*#06#即可查询。
     *
     * @param context
     * @return
     */
    public static String getIMEI(Context context) {
        TelephonyManager ts = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        return ts.getDeviceId();
    }

    /**
     * 获取SIM卡的IMSI码 SIM卡唯一标识：IMSI 国际移动用户识别码（IMSI：International Mobile Subscriber
     * Identification Number）是区别移动用户的标志，
     * 储存在SIM卡中，可用于区别移动用户的有效信息。IMSI由MCC、MNC、MSIN组成，其中MCC为移动国家号码，由3位数字组成，
     * 唯一地识别移动客户所属的国家，我国为460；MNC为网络id，由2位数字组成，
     * 用于识别移动客户所归属的移动网络，中国移动为00，中国联通为01,中国电信为03；MSIN为移动客户识别码，采用等长11位数字构成。
     * 唯一地识别国内GSM移动通信网中移动客户。所以要区分是移动还是联通，只需取得SIM卡中的MNC字段即可
     * 
     * @param context
     * @return
     */
    public static String getIMSI(Context context) {
        TelephonyManager ts = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        return ts.getSubscriberId();
    }

    /**
     * 返回手机的电话号码
     * @param context
     * @return
     */
    public static String getLine1Number(Context context) {
        TelephonyManager ts = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return ts.getLine1Number();
    }
}
