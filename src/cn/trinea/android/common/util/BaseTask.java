
package cn.trinea.android.common.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Build;

public abstract class BaseTask<Params, Progress, Result> extends
        AsyncTask<Params, Progress, Result> {

    @SuppressWarnings("unchecked")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public void exe(Params... params) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            executeOnExecutor(TaskUtil.DUAL_THREAD_EXECUTOR, params);
        } else {
            execute(params);
        }
    }

    public static class TaskUtil {

        private static final ThreadFactory sThreadFactory = new ThreadFactory() {
            private final AtomicInteger mCount = new AtomicInteger(1);

            public Thread newThread(Runnable r) {
                return new Thread(r, "AsyncTask #" + mCount.getAndIncrement());
            }
        };

        public static final Executor DUAL_THREAD_EXECUTOR = Executors.newFixedThreadPool(5,
                sThreadFactory);

    }
}
