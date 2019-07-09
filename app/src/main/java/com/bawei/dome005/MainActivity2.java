package com.bawei.dome005;

import android.view.View;
import android.widget.TextView;

import com.bawei.mylibrary.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author:程金柱
 * Date:2019/7/9 21:25
 * Description：
 */

public class MainActivity2 extends BaseActivity {
    @BindView(R.id.name)
    TextView textView;

    @OnClick(R.id.name)
    public void set(View view) {
        textView.setText("adsa");

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }


    @Override
    protected int bindLayout() {
        return R.layout.base;
    }
}
