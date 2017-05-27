package com.example.hkframework.net;

import android.app.Activity;

import com.example.hkframework.utils.NetStateUtils;

import rx.Subscriber;

/**
 * Created by Administrator on 2016/10/11 0011.
 *  http://blog.csdn.net/dd864140130/article/details/52689010
 */

public class BaseSubscriber<T> extends Subscriber<T> {
    private Activity mContext;

    public BaseSubscriber(Activity context) {
        mContext = context;
    }

   @Override
    public void onStart() {
        //请求开始之前，检查是否有网络。无网络直接抛出异常
        if (!NetStateUtils.isConnected(mContext)) {
            this.onError(new ApiException(ApiErrorCode.ERROR_NO_INTERNET,"无网络连接"));
        }
    }

    @Override
    public void onCompleted() {
    }

    @Override
    public void onError(Throwable e) {
        ApiErrorHelper.handleCommonError(mContext, e);
    }
    @Override
    public void onNext(T t) {

    }
}
