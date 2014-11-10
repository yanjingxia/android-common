
package cn.trinea.android.common.util;

public class LogUtils {
    /**
     * Priority constant for the println method; use LogUtils.v.
     */
    public static final int VERBOSE = android.util.Log.VERBOSE;

    /**
     * Priority constant for the println method; use LogUtils.d.
     */
    public static final int DEBUG = android.util.Log.DEBUG;

    /**
     * Priority constant for the println method; use LogUtils.i.
     */
    public static final int INFO = android.util.Log.INFO;

    /**
     * Priority constant for the println method; use LogUtils.w.
     */
    public static final int WARN = android.util.Log.WARN;

    /**
     * Priority constant for the println method; use LogUtils.e.
     */
    public static final int ERROR = android.util.Log.ERROR;

    /**
     * 关闭所有的Log信息常量
     */
    public static final int NO_DEBUG = 8;

    /**
     * Used to enable/disable logging that we don't want included in production
     * releases. This should be set to DEBUG for production releases, and
     * VERBOSE for internal builds.
     */
    public static final int MAX_ENABLED_LOG_LEVEL = VERBOSE;

    // public static final int MAX_ENABLED_LOG_LEVEL = NO_DEBUG;

    /**
     * Checks to see whether or not a log for the specified tag is loggable at
     * the specified level.
     */
    public static boolean isLoggable(String tag, int level) {
        if (MAX_ENABLED_LOG_LEVEL > level) {
            return false;
        }
        // 系统默认只能打印INFO 以上的Log信息，对于VERBOSE 和DEBUG的信息不能打印，所以，这里先返回true;
        return true;
        // return android.util.Log.isLoggable(tag, level);
    }

    /**
     * Send a {@link #VERBOSE} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int v(String tag, String format, Object... args) {
        if (isLoggable(tag, VERBOSE)) {
            return args.length > 0 ? android.util.Log.v(tag, String.format(format, args))
                    : android.util.Log.v(tag, format);
        }
        return 0;
    }

    /**
     * Send a {@link #VERBOSE} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param tr An exception to log
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int v(String tag, Throwable tr, String format, Object... args) {
        if (isLoggable(tag, VERBOSE)) {
            return args.length > 0 ? android.util.Log.v(tag, String.format(format, args), tr)
                    : android.util.Log.v(tag, format);
        }
        return 0;
    }

    /**
     * Send a {@link #DEBUG} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int d(String tag, String format, Object... args) {
        if (isLoggable(tag, DEBUG)) {
            return args.length > 0 ? android.util.Log.d(tag, String.format(format, args))
                    : android.util.Log.d(tag, format);
        }
        return 0;
    }

    /**
     * Send a {@link #DEBUG} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param tr An exception to log
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int d(String tag, Throwable tr, String format, Object... args) {
        if (isLoggable(tag, DEBUG)) {
            return args.length > 0 ? android.util.Log.d(tag, String.format(format, args), tr)
                    : android.util.Log.d(tag, format);
        }
        return 0;
    }

    /**
     * Send a {@link #INFO} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int i(String tag, String format, Object... args) {
        if (isLoggable(tag, INFO)) {
            return args.length > 0 ? android.util.Log.i(tag, String.format(format, args))
                    : android.util.Log.i(tag, format);
        }
        return 0;
    }

    /**
     * Send a {@link #INFO} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param tr An exception to log
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int i(String tag, Throwable tr, String format, Object... args) {
        if (isLoggable(tag, INFO)) {
            return args.length > 0 ? android.util.Log.i(tag, String.format(format, args), tr)
                    : android.util.Log.i(tag, format);
        }
        return 0;
    }

    /**
     * Send a {@link #WARN} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int w(String tag, String format, Object... args) {
        if (isLoggable(tag, WARN)) {
            return args.length > 0 ? android.util.Log.w(tag, String.format(format, args))
                    : android.util.Log.w(tag, format);
        }
        return 0;
    }

    /**
     * Send a {@link #WARN} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param tr An exception to log
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int w(String tag, Throwable tr, String format, Object... args) {
        if (isLoggable(tag, WARN)) {
            return args.length > 0 ? android.util.Log.w(tag, String.format(format, args), tr)
                    : android.util.Log.w(tag, format);
        }
        return 0;
    }

    /**
     * Send a {@link #ERROR} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int e(String tag, String format, Object... args) {
        if (isLoggable(tag, ERROR)) {
            return args.length > 0 ? android.util.Log.e(tag, String.format(format, args))
                    : android.util.Log.e(tag, format);
        }
        return 0;
    }

    /**
     * Send a {@link #ERROR} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param tr An exception to log
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int e(String tag, Throwable tr, String format, Object... args) {
        if (isLoggable(tag, ERROR)) {
            return args.length > 0 ? android.util.Log.e(tag, String.format(format, args), tr)
                    : android.util.Log.e(tag, format);
        }
        return 0;
    }

    /**
     * What a Terrible Failure: Report a condition that should never happen. The
     * error will always be logged at level ASSERT with the call stack.
     * Depending on system configuration, a report may be added to the
     * {@link android.os.DropBoxManager} and/or the process may be terminated
     * immediately with an error dialog.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int wtf(String tag, String format, Object... args) {
        return args.length > 0 ? android.util.Log
                .wtf(tag, String.format(format, args), new Error()) : android.util.Log.wtf(tag,
                format);
    }

    /**
     * What a Terrible Failure: Report a condition that should never happen. The
     * error will always be logged at level ASSERT with the call stack.
     * Depending on system configuration, a report may be added to the
     * {@link android.os.DropBoxManager} and/or the process may be terminated
     * immediately with an error dialog.
     * 
     * @param tag Used to identify the source of a log message. It usually
     *            identifies the class or activity where the log call occurs.
     * @param tr An exception to log
     * @param format the format string (see {@link java.util.Formatter#format})
     * @param args the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format}, additional
     *            arguments are ignored.
     */
    public static int wtf(String tag, Throwable tr, String format, Object... args) {
        return args.length > 0 ? android.util.Log.wtf(tag, String.format(format, args), tr)
                : android.util.Log.wtf(tag, format);
    }
}
