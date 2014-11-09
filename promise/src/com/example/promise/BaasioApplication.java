package com.example.promise;

import com.kth.baasio.Baas;
import com.kth.baasio.callback.BaasioDeviceCallback;
import com.kth.baasio.entity.push.BaasioDevice;
import com.kth.baasio.exception.BaasioException;
import com.kth.common.utils.LogUtils;

import android.app.Application;
import android.os.AsyncTask;

public class BaasioApplication extends Application{
	public void onCreate(){
		super.onCreate();
		
		Baas.io().init(this, 
				BaasioConfig.BAASIO_URL,
				BaasioConfig.BAASIO_ID,
				BaasioConfig.APPLICATION_ID);
	}
	public void onTerminate(){
		Baas.io().uninit(this);
		
		super.onTerminate();
	}
}