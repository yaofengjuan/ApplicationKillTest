package com.example.test;

import io.yunba.android.manager.YunBaManager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void OnButtonClick(View target) {
		Intent intent = new Intent("com.example.test");
		intent.putExtra(YunBaManager.MQTT_TOPIC, "InnerTopic");
		intent.putExtra(YunBaManager.MQTT_MSG, "Inner msg");
		intent.addCategory("com.hy.yunba").addCategory(Intent.CATEGORY_DEFAULT);
		sendBroadcast(intent);
	}

	public void OnStartServiceClick(View view) {
		Intent intent = new Intent("com.start.service");
		intent.addCategory(Intent.CATEGORY_DEFAULT);
		sendBroadcast(intent);
	}
}
