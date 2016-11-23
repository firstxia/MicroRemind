package com.xialm.microremind.view;

import android.content.Context;
import android.widget.Toast;

/**
 * 静态吐司
 * Created by Xialm on 2016-11-23.
 */

public class ToastUtils {

    private static Toast toast;

    public static void showToast(Context context, String text) {
        if (toast == null) {
            toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

    public static void showToast(String text) {
        showToast(App.getContext(),text);
    }
}
