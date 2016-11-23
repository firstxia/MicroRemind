package com.xialm.microremind;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xialm.microremind.view.ToastUtils;

import static com.xialm.microremind.R.id.btn_sb;

/**
 * 1.静态吐司
 * 2.AlertDialog运行在高版本的手机上(5.0以上系统),就是Material Design风格;但是如果低版本的手机也想使用这种
 * 风格的对话框,比如2.3版本的手机,怎么做呢?
 * 解决办法:使用android.support.v7.app.AlertDialog包下的AlertDialog,即使运行到低版本的手机上也是Material Design风格的
 * 3.Snackbar的使用:是从界面底部做动画弹出来的,用户处理了点击,就会立即消失;如果用户不处理,过一会儿自行消失
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(btn_sb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "删除?", Snackbar.LENGTH_SHORT)
                        .setAction("确定", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ToastUtils.showToast("点击了确定");
                            }
                        })
                        .setActionTextColor(Color.RED)
                        .show();
            }
        });

    }

    public void showDialog(View view) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("删除");
        dialog.setMessage("确定要残忍的删除吗?");
        dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ToastUtils.showToast("你点击了确定");
            }
        });
        dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ToastUtils.showToast("你点击了取消");
            }
        });
        dialog.show();
    }
}
