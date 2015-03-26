package com.example.test2;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

public class TestService extends Service {
	private static final String TAG = "TestService";

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		Recieve recieve = new Recieve();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.example.test");
		filter.addCategory("com.hy.yunba");
		filter.addCategory(Intent.CATEGORY_DEFAULT);
		registerReceiver(recieve, filter);
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				System.out.println("service progress is not  kill");
			}
		}, 20000);
	}

	private class Recieve extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {
			Log.d(TAG, intent.getAction() + "  " + intent.getDataString());
		}
	}

}
