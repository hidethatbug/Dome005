package com.bawei.mylibrary.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Author:程金柱
 * Date:2019/7/9 15:36
 * Description：
 */

public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        bind = ButterKnife.bind(this);
        initView();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (bind != null) {
            bind.unbind();
        }
    }

    protected abstract void initData();

    /**
     * 显示Toast
     *
     * @param msg
     */
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    protected abstract void initView();

    /**
     * 无参跳转
     *
     * @param aClass
     */
    public void startActivity(Class<?> aClass) {
        startActivity(new Intent(this, aClass));
    }

    /**
     * 有参跳转
     *
     * @param bundle
     * @param aClass
     */
    public void startActivity(Bundle bundle, Class<?> aClass) {
        Intent intent = new Intent(this, aClass);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * 绑定根布局
     *
     * @return
     */
    protected abstract int bindLayout();
}
