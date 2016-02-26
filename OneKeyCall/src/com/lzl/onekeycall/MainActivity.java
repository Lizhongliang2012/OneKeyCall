package com.lzl.onekeycall;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent(Intent.ACTION_CALL);
		Uri data = Uri.parse("tel:" + "13504287908");
		intent.setData(data);
		startActivity(intent);
		finish();
		setContentView(R.layout.activity_main);
	}

}
