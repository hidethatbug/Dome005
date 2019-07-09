package com.bawei.mylibrary.base.mvp;

import com.bawei.mylibrary.base.BaseActivity;

/**
 * Author:程金柱
 * Date:2019/7/9 19:46
 * Description：
 */

public abstract class BaseMvpActivity<M extends IBaseModel, P extends BasePresenter> extends
        BaseActivity implements IBaseView {
    public M model;
    public P prssenter;

    @Override
    protected void initData() {
        if (prssenter != null) {
            model = (M) prssenter.getModel();
            if (model != null) {
                //绑定
                prssenter.attach(model, this);
            }
        }
        init();
    }

    protected abstract void init();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解绑
        if (prssenter != null) {
            prssenter.dettach();
        }
    }
}
