package com.bawei.mylibrary.base.mvp;

/**
 * Author:程金柱
 * Date:2019/7/9 19:35
 * Description：
 */

public interface IBaseView {
    BasePresenter initPresenter();

    void showLoading();//显示加载框

    void hideLoading();//隐藏加载框

    void failure();//请求失败
}
