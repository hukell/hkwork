package com.example.hkframework.net;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Administrator on 2016/10/8 0008.
 */

public interface ApiService {

    /**
     *
     * 得到街道信息
     */
    @GET("area/getChengDuAreaInfo")
    Observable<BaseBean> getChengDuAreaInfo();

}
