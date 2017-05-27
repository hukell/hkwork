package com.example.administrator.hkwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.hkframework.net.Api;
import com.example.hkframework.net.BaseBean;
import com.example.hkframework.net.BaseSubscriber;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getCityInfo();

    }

    public void getCityInfo(){

        Api.getRetrofit().getChengDuAreaInfo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseSubscriber<BaseBean>(MainActivity.this){
                    @Override
                    public void onNext(BaseBean cityInfoBaseBean) {
                        super.onNext(cityInfoBaseBean);
                        String s = cityInfoBaseBean.getData().toString();
                        Log.i("54665465465",s);
                    }
                });


    }
}
