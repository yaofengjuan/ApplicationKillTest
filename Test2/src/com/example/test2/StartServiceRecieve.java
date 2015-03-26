package com.example.test2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StartServiceRecieve extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		System.out.println("service is will to start");
		context.startService(new Intent(context, TestService.class));
	}

}
