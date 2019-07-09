package com.bawei.mylibrary.base.mvp;

import java.lang.ref.WeakReference;

/**
 * Author:程金柱
 * Date:2019/7/9 19:36
 * Description：
 */

public abstract class BasePresenter<M, V> {
    public M model;
    public V view;
    private WeakReference<V> weakReference;

    public abstract M getModel();

    /**
     * 绑定
     *
     * @param model
     * @param view
     */
    public void attach(M model, V view) {
        this.model = model;
        weakReference = new WeakReference<>(view);
        this.view = weakReference.get();
    }

    /**
     * 解绑
     */
    public void dettach() {
//        if (view != null) {
//            view = null;
//        }
        if (weakReference != null) {
            weakReference.clear();//清空对象
            weakReference = null;
            this.view = null;
        }
    }
}
